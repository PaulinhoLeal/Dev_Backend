package com.lista.atividade1.model;

import java.util.UUID;

public class Produto {
    private UUID codigoBarra;
    private String nome;
    private double preco;

    public Produto() {
        this.codigoBarra = UUID.randomUUID();
    }

    public Produto(String nome, double valor) {
        this.codigoBarra = UUID.randomUUID();
        this.nome = nome;
        this.preco = valor;
    }

    public UUID getCodigoBarra() {
        return this.codigoBarra;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        }
    }
}
