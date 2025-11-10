package com.managecv.inventory.controller;

import com.managecv.inventory.model.Categoria;
import com.managecv.inventory.service.CategoriaService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/categorias")
@CrossOrigin(origins = "*")
public class CategoriaController {

    private final CategoriaService service;

    public CategoriaController(CategoriaService service) {
        this.service = service;
    }

    // Criar categoria (POST /categorias)
    @PostMapping
    public Categoria criar(@RequestBody Categoria categoria) {
        return service.criar(categoria);
    }

    // Listar categorias (GET /categorias)
    @GetMapping
    public List<Categoria> listar() {
        return service.listarTodas();
    }
}
