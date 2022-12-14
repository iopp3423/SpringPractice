package com.example.springStudy.repository;

import com.example.springStudy.domain.User;

import java.util.*;

public class UserRepository implements UserRepositoryInterFace{

    private Map<String, User> storeUser = new HashMap<>();

    @Override
    public User StoreMember(User user) {
        storeUser.put(user.getEmail(), user);
        return user;
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return  Optional.ofNullable(storeUser.get(email));
    }

    @Override
    public Optional<User> findOverlapEmail(String email) {
        return storeUser.values()
                .stream()
                .filter(user -> user.getEmail().equals(email))
                .findAny();
    }
    @Override
    public String findPassword(String email) {
        return storeUser.get(email).getPassword();
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(storeUser.values());
    }
}
