package com.lista.atividade1.model;

public class Produto {

    private int codigoBarra;
    private String nome;
    private double preco;


    public Produto(){}
    public Produto(int codigoBarra, String nome, double valor)
    {
        this.codigoBarra = codigoBarra;
        this.nome = nome;
        this.preco= valor;
    }

    public int getCodigoBarra(){
        return this.codigoBarra;
    }
    public int setCodigoBarra(int codigoBarra){
        this.codigoBarra = codigoBarra;
        return codigoBarra;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
