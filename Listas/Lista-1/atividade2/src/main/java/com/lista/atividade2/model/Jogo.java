package com.lista.atividade2.model;

import java.util.UUID;

public class Jogo {
    private UUID id;
    private String nome;
    private double valor;

    public Jogo() {
        this.id = UUID.randomUUID();
    }

    public Jogo(String nome, double valor) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.valor = valor;
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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
