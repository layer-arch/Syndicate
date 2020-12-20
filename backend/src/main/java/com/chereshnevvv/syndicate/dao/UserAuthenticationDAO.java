package com.chereshnevvv.syndicate.dao;

public interface UserAuthenticationDAO {
    boolean canAuthenticate(String token);
}
