package com.managecv.inventory.service;

import com.managecv.inventory.model.Product;
import com.managecv.inventory.repository.ProductRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // Create new product
    public Product create(Product product) {
        return productRepository.save(product);
    }

    // List all products
    public List<Product> getAll() {
        return productRepository.findAll();
    }
}
