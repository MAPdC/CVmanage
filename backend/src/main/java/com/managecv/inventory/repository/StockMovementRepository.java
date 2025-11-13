package com.managecv.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.managecv.inventory.model.StockMovement;

public interface StockMovementRepository extends JpaRepository<StockMovement, Long> {
}
