package com.example.springStudy.repository;

import com.example.springStudy.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.util.List;

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

        User result = repository.findByEmail("test123").get();
        Assertions.assertEquals(result, user);
    }

    @Test
    void findByEmail() {
        User user = new User();
        user.setEmail("test123");
        user.setName("김테스트");
        user.setPassword("test");
        repository.StoreMember(user);

        User result = repository.findByEmail("test123").get();
        Assertions.assertEquals(result, user);
    }

    @Test
    void findPassword() {
        User user = new User();
        user.setEmail("test");
        user.setName("김테스트");
        user.setPassword("test123");
        repository.StoreMember(user);

        String password = repository.findPassword("test");

        Assertions.assertEquals(password, user.getPassword());
    }

    @Test
    void findAll() {
        User user = new User();
        user.setEmail("test");
        user.setName("김테스트");
        user.setPassword("test123");
        repository.StoreMember(user);

        List<User> userList = repository.findAll();
        Assertions.assertEquals(userList.size(), 1);
    }
}