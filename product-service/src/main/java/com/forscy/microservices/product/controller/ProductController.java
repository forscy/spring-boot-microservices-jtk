package com.forscy.microservices.product.controller;

import com.forscy.microservices.product.dto.ProductRequest;
import com.forscy.microservices.product.dto.ProductResponse;
import com.forscy.microservices.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    // Mengembalikan ResponseEntity dengan status dan respons body
    @PostMapping
    public ResponseEntity<ProductResponse> createProduct(@RequestBody ProductRequest productRequest) {
        // Simulasi pembuatan produk baru
        ProductResponse productResponse = productService.createProduct(productRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(productResponse);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProducts() {
        return productService.getAllProducts();
    }
}
