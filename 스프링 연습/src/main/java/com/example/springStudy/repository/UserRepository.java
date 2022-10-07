package com.example.springStudy.repository;

import com.example.springStudy.domain.User;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
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
    public String findPassword(String email) {
        return storeUser.get(email).getPassword();
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(storeUser.values());
    }
    public void clear(){
        storeUser.clear();
    }
}
