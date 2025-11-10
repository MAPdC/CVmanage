package com.managecv.inventory.controller;

import org.springframework.web.bind.annotation.*;

import com.managecv.inventory.model.MovimentoStock;
import com.managecv.inventory.service.MovimentoStockService;

@RestController
@RequestMapping("/movimentos")
@CrossOrigin(origins = "*")
public class MovimentoStockController {

    private final MovimentoStockService service;

    public MovimentoStockController(MovimentoStockService service) {
        this.service = service;
    }

    @PostMapping
    public MovimentoStock criarMovimento(@RequestBody MovimentoRequest dto) {
        return service.registarMovimento(
                dto.loteId,
                dto.quantidade,
                dto.tipoMovimento,
                dto.observacao
        );
    }

    public static class MovimentoRequest {
        public Long loteId;
        public Integer quantidade;
        public String tipoMovimento;
        public String observacao;
    }
}
