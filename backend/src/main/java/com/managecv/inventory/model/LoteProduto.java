package com.managecv.inventory.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class LoteProduto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    private Produto produto;

    private String codigoLote;
    private Integer anoSafra;
    private Integer quantidadeAtual;
    private LocalDate dataProducao;

    public LoteProduto() {}

    public LoteProduto(Produto produto, String codigoLote, Integer anoSafra, Integer quantidadeAtual, LocalDate dataProducao) {
        this.produto = produto;
        this.codigoLote = codigoLote;
        this.anoSafra = anoSafra;
        this.quantidadeAtual = quantidadeAtual;
        this.dataProducao = dataProducao;
    }

    public Long getId() {
        return id;
    }

    public Produto getProduto() {
        return produto;
    }

    public String getCodigoLote() {
        return codigoLote;
    }

    public Integer getAnoSafra() {
        return anoSafra;
    }

    public Integer getQuantidadeAtual() {
        return quantidadeAtual;
    }

    public LocalDate getDataProducao() {
        return dataProducao;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void setCodigoLote(String codigoLote) {
        this.codigoLote = codigoLote;
    }

    public void setAnoSafra(Integer anoSafra) {
        this.anoSafra = anoSafra;
    }

    public void setQuantidadeAtual(Integer quantidadeAtual) {
        this.quantidadeAtual = quantidadeAtual;
    }

    public void setDataProducao(LocalDate dataProducao) {
        this.dataProducao = dataProducao;
    }

}