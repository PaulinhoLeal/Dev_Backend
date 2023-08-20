package com.aula7.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity

public class Jogo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    @NotNull
    private String nome;
    private String descricao;
    @NotNull
    private double preco;
    @NotNull
    private String img;
    @JsonProperty("esta_favoritado")
    private boolean estaFavoritado;

    @ManyToOne
    @JoinColumn(name= "categoria_id")
    @JsonIgnoreProperties("jogos")
    private  Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "conta_id")
    @JsonIgnoreProperties("jogos")
    private Conta conta;





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
