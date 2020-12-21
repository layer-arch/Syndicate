package com.chereshnevvv.syndicate.dao.impl;

import com.chereshnevvv.syndicate.dao.UserAuthenticationDAO;
import com.chereshnevvv.syndicate.models.User;
import com.chereshnevvv.syndicate.repositories.UserRepository;
import com.chereshnevvv.syndicate.rest.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("userAuthenticationDAO")
public class UserAuthenticationDAOImpl implements UserAuthenticationDAO {
    private final UserRepository userRepository;

    public UserAuthenticationDAOImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public boolean canAuthenticate(String token) {
        Optional<User> check = userRepository.findByToken(token);
        return check.isPresent();
    }

    @Override
    public ResponseEntity<Response<?>> register() {
        return null;
    }
}
