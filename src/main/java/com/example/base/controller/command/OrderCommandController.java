package com.example.base.controller.command;

import com.example.base.service.OrderCommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderCommandController {

    @Autowired
    private OrderCommandService orderCommandService;

}
