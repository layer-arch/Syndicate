package com.chereshnevvv.syndicate.dao;

import com.chereshnevvv.syndicate.rest.Response;
import org.springframework.http.ResponseEntity;

public interface UserAuthenticationDAO {
    boolean canAuthenticate(String token);
    ResponseEntity<Response<?>> register();
}
