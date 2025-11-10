package com.managecv.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.managecv.inventory.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
