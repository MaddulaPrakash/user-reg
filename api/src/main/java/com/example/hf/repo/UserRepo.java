package com.example.hf.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hf.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}

