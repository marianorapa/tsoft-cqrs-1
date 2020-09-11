package com.example.base.service.impl;

import com.example.base.entity.User;
import com.example.base.repository.UserRepository;
import com.example.base.service.UserQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserQueryServiceImpl implements UserQueryService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public String getUserNameById(Long id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            return user.get().getFirstname();
        }
        return "";
    }
}
