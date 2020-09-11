package com.example.base.service.impl;

import com.example.base.dto.OrdersUserSummaryDto;
import com.example.base.entity.Order;
import com.example.base.repository.OrderRepository;
import com.example.base.service.OrderQueryService;
import com.example.base.service.UserQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderQueryServiceImpl implements OrderQueryService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private UserQueryService userQueryService;

    @Override
    public OrdersUserSummaryDto getOrdersSummaryByUser(Long userId) {
        OrdersUserSummaryDto ordersUserSummaryDto = new OrdersUserSummaryDto();
        ordersUserSummaryDto.setUserName(userQueryService.getUserNameById(userId));

        ordersUserSummaryDto.setTotalAmt(orderRepository
                .findByUserId(userId).stream().map(Order::getTotalAmt).reduce((double) 0, Double::sum));

        return ordersUserSummaryDto;
    }
}