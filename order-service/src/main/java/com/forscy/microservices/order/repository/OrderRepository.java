package com.forscy.microservices.order.repository;

import com.forscy.microservices.order.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
