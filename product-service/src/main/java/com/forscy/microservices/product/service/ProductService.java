package com.forscy.microservices.product.service;

import com.forscy.microservices.product.dto.ProductRequest;
import com.forscy.microservices.product.dto.ProductResponse;
import com.forscy.microservices.product.model.Product;
import com.forscy.microservices.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {

    private final ProductRepository productRepository;

    public ProductResponse createProduct(ProductRequest productRequest) {
        // Membuat objek Product dari ProductRequest
        Product product = Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();

        // Menyimpan produk ke database
        Product savedProduct = productRepository.save(product);

        // Mencatat log bahwa produk telah disimpan dengan ID-nya
        log.info("Product {} is saved", savedProduct.getId());

        // Mengonversi Product ke ProductResponse dan mengembalikannya
        return mapToProductResponse(savedProduct);
    }

    public List<ProductResponse> getAllProducts() {
        // Mengambil semua produk dari database
        List<Product> products = productRepository.findAll();

        // Mengonversi setiap Product menjadi ProductResponse dan mengembalikannya
        return products.stream()
                .map(this::mapToProductResponse)
                .toList();
    }

    private ProductResponse mapToProductResponse(Product product) {
        // Mengonversi Product menjadi ProductResponse
        return ProductResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();
    }
}
