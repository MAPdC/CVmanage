package com.managecv.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.managecv.inventory.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
