package com.example.base.controller.query;

import com.example.base.dto.OrdersUserSummaryDto;
import com.example.base.service.OrderQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderQueryController {

    @Autowired
    private OrderQueryService orderQueryService;

    @GetMapping("/summary/{userId}")
    public OrdersUserSummaryDto getOrdersSummaryByUser(@PathVariable Long userId) {
        return orderQueryService.getOrdersSummaryByUser(userId);
    }

}
