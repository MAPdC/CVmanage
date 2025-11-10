package com.managecv.inventory.model;

import com.managecv.inventory.model.enums.TipoMovimento;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class MovimentoStock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    private LoteProduto lote;

    private LocalDate data;

    private Integer quantidade;

    @Enumerated(EnumType.STRING)
    private TipoMovimento tipoMovimento;

    private String observacao;

    public MovimentoStock() {}

    public MovimentoStock(LoteProduto lote, LocalDate data, Integer quantidade, TipoMovimento tipoMovimento, String observacao) {
        this.lote = lote;
        this.data = data;
        this.quantidade = quantidade;
        this.tipoMovimento = tipoMovimento;
        this.observacao = observacao;
    }

    public Long getId() {
        return id;
    }

    public LoteProduto getLote() {
        return lote;
    }

    public LocalDate getData() {
        return data;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public TipoMovimento getTipoMovimento() {
        return tipoMovimento;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setLote(LoteProduto lote) {
        this.lote = lote;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public void setTipoMovimento(TipoMovimento tipoMovimento) {
        this.tipoMovimento = tipoMovimento;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
