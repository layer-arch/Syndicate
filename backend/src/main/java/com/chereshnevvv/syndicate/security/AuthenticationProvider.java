package com.chereshnevvv.syndicate.security;

import com.chereshnevvv.syndicate.dao.UserAuthenticationDAO;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationProvider implements org.springframework.security.authentication.AuthenticationProvider {
    private final UserAuthenticationDAO dao;

    public AuthenticationProvider(UserAuthenticationDAO dao) {
        this.dao = dao;
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        if(authentication.getCredentials() == null)
            return null;

        String token = authentication.getCredentials().toString();
        if(!dao.canAuthenticate(token))
            return null;

        return new UsernamePasswordAuthenticationToken(token, token);
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }
}
