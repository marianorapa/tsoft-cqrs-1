package com.example.base.service;

import com.example.base.dto.OrdersUserSummaryDto;

import java.util.List;

public interface OrderQueryService {

    OrdersUserSummaryDto getOrdersSummaryByUser(Long userId);

}