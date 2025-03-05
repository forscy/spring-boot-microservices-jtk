package com.forscy.microservices.inventory;

import org.springframework.boot.SpringApplication;

import com.forscy.microservices.inventory.InventoryServiceApplication;

public class TestInventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(InventoryServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
