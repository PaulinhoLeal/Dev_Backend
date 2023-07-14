package com.lista4.ex02.model;

public class Sala {

    private int id;
    private boolean estaAlugado;
    private String nomeLocatorio;


    public Sala (){}

    public Sala (int id, boolean estaAlugado, String nomeLocatorio){
        this.id=id;
        this.estaAlugado=estaAlugado;
        this.nomeLocatorio=nomeLocatorio;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }

    public boolean getEstaAlugado() {
        return estaAlugado;
    }

    public void setEstaAlugado(boolean estaAlugado) {
        this.estaAlugado = estaAlugado;
    }

    public String getNomeLocatorio() {
        return nomeLocatorio;
    }

    public void setNomeLocatorio(String nomeLocatorio) {
        this.nomeLocatorio = nomeLocatorio;
    }
}
