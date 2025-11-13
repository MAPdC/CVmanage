package com.managecv.inventory.service;

import com.managecv.inventory.model.ProductCategory;
import com.managecv.inventory.repository.ProductCategoryRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductCategoryService {

    private final ProductCategoryRepository productCategoryRepository;

    public ProductCategoryService(ProductCategoryRepository productCategoryRepository) {
        this.productCategoryRepository = productCategoryRepository;
    }

    // Create new product category
    public ProductCategory create(ProductCategory productCategory) {
        return productCategoryRepository.save(productCategory);
    }

    // List all product categories
    public List<ProductCategory> getAll() {
        return productCategoryRepository.findAll();
    }
}
