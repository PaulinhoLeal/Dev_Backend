package com.aula7.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Jogo {
    private int id;
    private String nome;
    private String descricao;
    private double preco;
    private String img;
    @JsonProperty("esta_favoritado")
    private boolean estaFavoritado;


    public Jogo(int id, String nome, String descricao, double preco, String img, boolean estaFavoritado) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.img = img;
        this.estaFavoritado = estaFavoritado;
    }

    public int getId(){
      return   this.id;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getImg(){
        return this.img;
    }
    public void setImg(String img ){
        this.img=img;
    }
    public boolean isEstaFavoritado() {
        return estaFavoritado;
    }

    public void setEstaFavoritado(boolean estaFavoritado) {
        this.estaFavoritado = estaFavoritado;
    }
}
