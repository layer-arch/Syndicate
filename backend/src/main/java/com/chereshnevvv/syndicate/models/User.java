package com.chereshnevvv.syndicate.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username;
    private String password;
    private String token;

    public User() {
    }

    public User(String username, String password, String token) {
        this.username = username;
        this.password = password;
        this.token = token;
    }
}
