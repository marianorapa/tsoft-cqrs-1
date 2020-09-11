package com.example.base.service.impl;

import com.example.base.dto.CreateOrderCommandDto;
import com.example.base.entity.Order;
import com.example.base.entity.Product;
import com.example.base.entity.User;
import com.example.base.repository.OrderRepository;
import com.example.base.repository.ProductRepository;
import com.example.base.repository.UserRepository;
import com.example.base.service.OrderCommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderCommandServiceImpl implements OrderCommandService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public Order createOrder(CreateOrderCommandDto command) {
        User user = userRepository.findById(command.getUserId()).orElse(new User());

        List<Product> products = productRepository.findAllById(command.getProductIds());

        Order newOrder = new Order();
        newOrder.setUser(user);
        newOrder.setDate(new Date());
        newOrder.setProducts(products);

        orderRepository.save(newOrder);

        return newOrder;
    }

    @Override
    public void cancelOrder(Long userId) {

    }
}
