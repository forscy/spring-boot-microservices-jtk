package com.forscy.microservices.inventory.service;

import com.forscy.microservices.inventory.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class InventoryService {

    private final InventoryRepository inventoryRepository;

    public boolean isInStock(String skuCode, Integer quantity) {
        return inventoryRepository.existsBySkuCodeAndQuantityGreaterThanEqual(skuCode, quantity);
    }

}
