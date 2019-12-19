package com.application.user.ws.com.application.user.service;

import com.application.user.ws.com.application.shared.dto.UserDto;
import com.application.user.ws.com.application.user.model.com.application.user.repository.UserRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImp implements UserService {

    UserRepository userRepository;

    @Autowired
    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void create(UserDto user) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.con
    }
}
