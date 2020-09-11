package com.example.base.controller.command;

import com.example.base.dto.UserCommandDto;
import com.example.base.entity.User;
import com.example.base.service.UserCommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserCommandController {

    @Autowired
    private UserCommandService userCommandService;

    @PostMapping("/save")
    public String saveUser(@RequestBody UserCommandDto dto){

       return this.userCommandService.saveUser(dto);
    }

}