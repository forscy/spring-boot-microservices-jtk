package com.forscy.microservices.inventory.repository;

import com.forscy.microservices.inventory.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository  extends JpaRepository<Inventory, Long> {
    boolean existsBySkuCodeAndQuantityGreaterThanEqual(String skuCode, Integer quantity);
}
