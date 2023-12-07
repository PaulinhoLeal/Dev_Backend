package com.example.lista_3.model;

import java.util.UUID;

public class Produto {
    private UUID id;
    private String nome;
    private double preco;

    public Produto() {
        this.id = UUID.randomUUID();
    }

    public Produto(String nome, double preco) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.preco = preco;
    }

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
