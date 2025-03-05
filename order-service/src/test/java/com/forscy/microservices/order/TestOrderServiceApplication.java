package com.forscy.microservices.order;

import org.springframework.boot.SpringApplication;

import com.forscy.microservices.order.OrderServiceApplication;

public class TestOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(OrderServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
