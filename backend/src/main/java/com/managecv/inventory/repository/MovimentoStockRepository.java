package com.managecv.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.managecv.inventory.model.MovimentoStock;

public interface MovimentoStockRepository extends JpaRepository<MovimentoStock, Long> {
}
