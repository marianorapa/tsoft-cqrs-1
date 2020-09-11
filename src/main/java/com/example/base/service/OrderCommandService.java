package com.example.base.service;

import com.example.base.dto.CreateOrderCommandDto;
import com.example.base.entity.Order;

import java.util.List;

public interface OrderCommandService {

    Order createOrder(CreateOrderCommandDto command);

    void cancelOrder(Long userId);

}