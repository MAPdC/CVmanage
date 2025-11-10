package com.managecv.inventory.service;

import com.managecv.inventory.model.enums.TipoMovimento;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.managecv.inventory.model.LoteProduto;
import com.managecv.inventory.model.MovimentoStock;
import com.managecv.inventory.repository.LoteProdutoRepository;
import com.managecv.inventory.repository.MovimentoStockRepository;

import java.time.LocalDate;

@Service
public class MovimentoStockService {

    private final MovimentoStockRepository movimentoStockRepository;
    private final LoteProdutoRepository loteProdutoRepository;

    public MovimentoStockService(MovimentoStockRepository movimentoStockRepository,
                                 LoteProdutoRepository loteProdutoRepository) {
        this.movimentoStockRepository = movimentoStockRepository;
        this.loteProdutoRepository = loteProdutoRepository;
    }

    @Transactional
    public MovimentoStock registarMovimento(Long loteId, Integer quantidade,
                                            String tipoMovimento, String observacao) {

        // Carregar lote
        LoteProduto lote = loteProdutoRepository.findById(loteId)
                .orElseThrow(() -> new RuntimeException("Lote não encontrado: " + loteId));

        // Atualizar stock (permitindo negativo)
        lote.setQuantidadeAtual(lote.getQuantidadeAtual() + quantidade);
        loteProdutoRepository.save(lote);

        // Criar movimento
        MovimentoStock movimento = new MovimentoStock();
        movimento.setLote(lote);
        movimento.setData(LocalDate.now());
        movimento.setQuantidade(quantidade);
        movimento.setTipoMovimento(TipoMovimento.valueOf(tipoMovimento.toUpperCase()));
        movimento.setObservacao(observacao);

        return movimentoStockRepository.save(movimento);
    }
}
