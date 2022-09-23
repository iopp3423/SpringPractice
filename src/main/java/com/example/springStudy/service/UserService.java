package com.example.springStudy.service;

import com.example.springStudy.domain.User;
import com.example.springStudy.repository.UserRepository;

import java.util.List;
import java.util.Optional;

public class UserService {
    private UserRepository userRepository= new UserRepository();

    public User join(User user){
        userRepository.StoreMember(user);
        return user;
    }
    public Optional<User> searchUser(String email){
        return userRepository.findByEmail(email);
    }
    public String findPassword(String email){
        return userRepository.findPassword(email);
    }
    public List<User> findAllUser(){
        return userRepository.findAll();
    }

}
