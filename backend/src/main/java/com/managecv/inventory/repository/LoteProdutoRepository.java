package com.managecv.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.managecv.inventory.model.LoteProduto;

public interface LoteProdutoRepository extends JpaRepository<LoteProduto, Long> {
}
