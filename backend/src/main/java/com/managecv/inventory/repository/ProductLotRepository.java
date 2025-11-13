package com.managecv.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.managecv.inventory.model.ProductLot;

public interface ProductLotRepository extends JpaRepository<ProductLot, Long> {
}
