package com.managecv.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.managecv.inventory.model.ProductCategory;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
