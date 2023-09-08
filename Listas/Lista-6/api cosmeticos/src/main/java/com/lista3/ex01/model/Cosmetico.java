package com.lista3.ex01.model;

import java.math.BigDecimal;

public class Cosmetico {
    private int id;
    private String nome;
    private BigDecimal preco;
    private String imagem;

    public Cosmetico(){}

    public Cosmetico(int id, String nome, BigDecimal preco, String imagem){
        this.id=id;
        this.nome=nome;
        this.preco=preco;
        this.imagem=imagem;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
         this.id=id;
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

    public String getImagem (){return this.imagem;}

    public void setImagem(String imagem){this.imagem=imagem;}
}
