package com.forscy.microservices.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.forscy.microservices.inventory.model.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {

    boolean existsBySkuCodeAndQuantityGreaterThanEqual(String skuCode, Integer quantity);
}
