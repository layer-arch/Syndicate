package com.chereshnevvv.syndicate.rest;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Response<T> {
    private int status;

    private T body;

    public Response(int status) {
        this.status = status;
    }

    public Response(int status, T body) {
        this.status = status;
        this.body = body;
    }
}
