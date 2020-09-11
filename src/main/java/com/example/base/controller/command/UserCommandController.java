package com.example.base.controller.command;

import com.example.base.dto.UserCommandDto;
import com.example.base.service.OrderCommandService;
import com.example.base.service.UserCommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserCommandController {

    @Autowired
    private UserCommandService userCommandService;

    @PostMapping("/save")
    public void saveUser(@RequestBody UserCommandDto dto){
        this.userCommandService.saveUser(dto);
    }

}