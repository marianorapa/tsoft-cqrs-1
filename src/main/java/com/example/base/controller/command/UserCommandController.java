package com.example.base.controller.command;

import com.example.base.dto.UserCommandDto;
import com.example.base.entity.User;
import com.example.base.service.UserCommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserCommandController {

    @Autowired
    private UserCommandService userCommandService;

    @GetMapping
    public String hello(){
        return "Hello world";
    }

    @PostMapping("/save")
    public User saveUser(@RequestBody UserCommandDto dto){
        System.out.println("Saving user: " + dto);
        return this.userCommandService.saveUser(dto);
    }

}