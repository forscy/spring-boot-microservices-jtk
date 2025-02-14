package com.forscy.microservices.order.service;

import com.forscy.microservices.order.dto.OrderRequest;
import com.forscy.microservices.order.model.Order;
import com.forscy.microservices.order.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public void placeOrder(OrderRequest orderRequest) {

        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());
        order.setPrice(orderRequest.price());
        order.setSkuCode(orderRequest.skuCode());
        order.setQuantity(orderRequest.quantity());
        orderRepository.save(order);

    }
}