package com.lista3.ex01.model;

import java.math.BigDecimal;
import java.util.UUID;

import org.springframework.stereotype.Component;

@Component
public class Cosmetico {
    private UUID id;
    private String nome;
    private BigDecimal preco;
    private String imagem;

    public Cosmetico() {
        this.id = UUID.randomUUID();
    }

    public Cosmetico(String nome, BigDecimal preco, String imagem) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.preco = preco;
        this.imagem = imagem;
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

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

}
