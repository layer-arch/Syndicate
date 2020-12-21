package com.chereshnevvv.syndicate.dao;

import com.chereshnevvv.syndicate.models.User;
import com.chereshnevvv.syndicate.rest.Response;
import org.springframework.http.ResponseEntity;

public interface UserAuthenticationDAO {
    boolean canAuthenticate(String token);
    ResponseEntity<Response<?>> register(User user);
    ResponseEntity<Response<?>> login(User user);
}
