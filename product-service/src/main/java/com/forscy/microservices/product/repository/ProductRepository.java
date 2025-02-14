package com.forscy.microservices.product.repository;

import com.forscy.microservices.product.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
