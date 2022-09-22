package com.example.springStudy.repository;

import com.example.springStudy.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserRepositoryInterFace {
    User StoreMember(User user); // 회원정보 저장하기
    Optional<User> findByEmail(String email); // 이메일로 회원정보 찾기
    Optional<User> findOverlapEmail(String email); // 이메일 중복 검사하기
    String findPassword(String email); // 비밀번호 찾기
    List<User> findAll(); // 유저정보 가져오기
}
