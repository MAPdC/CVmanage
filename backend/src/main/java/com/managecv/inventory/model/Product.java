package com.managecv.inventory.model;

import jakarta.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne(optional = false)
    private ProductCategory productCategory;

    private String baseUnit;

    public Product() {}

    public Product(String name, ProductCategory productCategory, String baseUnit) {
        this.name = name;
        this.productCategory = productCategory;
        this.baseUnit = baseUnit;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public String getBaseUnit() {
        return baseUnit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public void setBaseUnit(String baseUnit) {
        this.baseUnit = baseUnit;
    }
}