package com.chereshnevvv.syndicate.dao;

import com.chereshnevvv.syndicate.models.User;
import com.chereshnevvv.syndicate.rest.Response;
import com.chereshnevvv.syndicate.rest.UserRest;

public interface Converter {
    UserRest dtoUserToRest(User user);
    <T> Response<T> createResponse(T body, int status);
    <T> Response<T> createResponse(T body);
    Response<String> createResponse(int status);
}
