package com.example.base.service;

import java.util.List;

public interface OrderCommandService {

    void createOrder(Long userId, List<Long> productIds);

    void cancelOrder(Long userId);

}