package com.diyosinfotech.service;



import org.springframework.stereotype.Service;

import com.diyosinfotech.entitie.User;
import com.diyosinfotech.repositories.UserRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

 

}