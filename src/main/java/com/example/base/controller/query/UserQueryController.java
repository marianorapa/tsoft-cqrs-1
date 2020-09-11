package com.example.base.controller.query;

import com.example.base.dto.UserCommandDto;
import com.example.base.entity.User;
import com.example.base.service.UserQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserQueryController {

    @Autowired
    private UserQueryService userQueryService;

    @GetMapping("/users")
    private List<User> getUsers(){
        List<User> users = userQueryService.getAllUsers();
        return users;
    }

}
