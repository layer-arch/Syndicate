package com.chereshnevvv.syndicate.dao.impl;

import com.chereshnevvv.syndicate.dao.Converter;
import com.chereshnevvv.syndicate.models.User;
import com.chereshnevvv.syndicate.rest.Response;
import com.chereshnevvv.syndicate.rest.UserRest;
import org.springframework.stereotype.Service;

@Service("converterSerivce")
public class ConverterImpl implements Converter {
    @Override
    public UserRest dtoUserToRest(User user) {
        return new UserRest(user.getId(), user.getUsername(), user.getToken());
    }

    @Override
    public <T> Response<T> createResponse(T body, int status) {
        return new Response<>(status, body);
    }

    @Override
    public <T> Response<T> createResponse(T body) {
        return new Response<>(200, body);
    }

    @Override
    public Response<String> createResponse(int status) {
        return new Response<>(status, "no body provided");
    }
}
