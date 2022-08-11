package com.company.singleresp;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.fasterxml.jackson.databind.ObjectMapper;

//Handles incoming JSON requests that work on User resource/entity
public class UserController {

    UserPersistenceService service = new UserPersistenceService();
    
    //Create a new user
    public String createUser(String userJson) throws IOException {
        UserWrapper userWrapper = new UserWrapper();
        UserValidator userValidator = new UserValidator();

        User user = userWrapper.userUnwrap(userJson);

        if(!userValidator.valilateUser(user)) {
            return "ERROR";
        }

        service.saveUser(user);
        
        return "SUCCESS";
    }
}