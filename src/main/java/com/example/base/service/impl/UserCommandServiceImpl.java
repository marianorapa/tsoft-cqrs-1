package com.example.base.service.impl;

import com.example.base.dto.UserCommandDto;
import com.example.base.repository.UserRepository;
import com.example.base.service.UserCommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserCommandServiceImpl implements UserCommandService {

    @Autowired
    UserRepository userRepository;

    @Override
    public void saveUser(UserCommandDto dto) {

    }
}
