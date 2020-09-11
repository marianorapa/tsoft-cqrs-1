package com.example.base.service;

import com.example.base.entity.User;

import java.util.List;

public interface UserQueryService {

    public String getUserNameById(Long id);

    List<User> getAllUsers();
}