package com.chereshnevvv.syndicate.rest;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRest {
    private long id;
    private String username;
    private String token;

    public UserRest(long id, String username, String token) {
        this.id = id;
        this.username = username;
        this.token = token;
    }
}
