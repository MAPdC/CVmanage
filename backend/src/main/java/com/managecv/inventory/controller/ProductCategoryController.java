package com.managecv.inventory.controller;

import com.managecv.inventory.model.ProductCategory;
import com.managecv.inventory.service.ProductCategoryService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/product-category")
@CrossOrigin(origins = "*")
public class ProductCategoryController {

    private final ProductCategoryService service;

    public ProductCategoryController(ProductCategoryService service) {
        this.service = service;
    }

    // Create product category (POST /product-category)
    @PostMapping
    public ProductCategory create(@RequestBody ProductCategory productCategory) {
        return service.create(productCategory);
    }

    // List all product categories (GET /product-category)
    @GetMapping
    public List<ProductCategory> getAll() {
        return service.getAll();
    }
}
