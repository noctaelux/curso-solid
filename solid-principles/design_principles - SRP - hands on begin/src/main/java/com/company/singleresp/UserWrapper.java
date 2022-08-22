package com.company.singleresp;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class UserWrapper {

    public User userUnwrap(String userJson) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(userJson,User.class);
    }

}
