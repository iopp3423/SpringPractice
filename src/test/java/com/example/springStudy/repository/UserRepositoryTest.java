package com.example.springStudy.repository;

import com.example.springStudy.domain.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {

    UserRepository repository = new UserRepository();

    @Test
    void storeMember() {
        User user = new User();
        user.setEmail("test123");
        user.setName("김테스트");
        user.setPassword("test");
        repository.StoreMember(user);
    }

    @Test
    void findByEmail() {
    }

    @Test
    void findOverlapEmail() {
    }

    @Test
    void findPassword() {
    }

    @Test
    void findAll() {
    }
}