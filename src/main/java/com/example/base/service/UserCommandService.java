package com.example.base.service;

import com.example.base.dto.UserCommandDto;
import org.springframework.web.bind.annotation.RequestBody;

public interface UserCommandService {

    void saveUser(@RequestBody UserCommandDto dto);

}
