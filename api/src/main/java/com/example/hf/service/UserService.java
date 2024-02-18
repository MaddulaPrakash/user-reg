package com.example.hf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hf.entity.User;
import com.example.hf.repo.UserRepo;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;

    public String saveUser(User user) {

        repo.save(user);
        return "User registered Successfully";
    }
}
