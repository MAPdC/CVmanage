package com.managecv.inventory.service;

import com.managecv.inventory.model.Categoria;
import com.managecv.inventory.repository.CategoriaRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    // Criar nova categoria
    public Categoria criar(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    // Listar todas
    public List<Categoria> listarTodas() {
        return categoriaRepository.findAll();
    }
}
