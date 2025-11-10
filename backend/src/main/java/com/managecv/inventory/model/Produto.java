package com.managecv.inventory.model;

import jakarta.persistence.*;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToOne(optional = false)
    private Categoria categoria;

    private String unidadeBase;

    public Produto() {}

    public Produto(String nome, Categoria categoria, String unidadeBase) {
        this.nome = nome;
        this.categoria = categoria;
        this.unidadeBase = unidadeBase;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public String getUnidadeBase() {
        return unidadeBase;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setUnidadeBase(String unidadeBase) {
        this.unidadeBase = unidadeBase;
    }
}