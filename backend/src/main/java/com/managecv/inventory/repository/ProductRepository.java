package com.managecv.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.managecv.inventory.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
