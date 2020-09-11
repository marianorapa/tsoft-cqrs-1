package com.example.base.controller.command;

import com.example.base.dto.CreateOrderCommandDto;
import com.example.base.entity.Order;
import com.example.base.service.OrderCommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderCommandController {

    @Autowired
    private OrderCommandService orderCommandService;

    @PostMapping("/save")
    public Order saveOrder(@RequestBody CreateOrderCommandDto createOrderCommandDto) {
        return orderCommandService.createOrder(createOrderCommandDto);
    }
}
