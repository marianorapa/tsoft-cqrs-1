package com.example.base.service;

import com.example.base.dto.UserCommandDto;
import com.example.base.entity.User;

public interface UserCommandService {

    User saveUser(UserCommandDto dto);

}
