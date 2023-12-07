package com.lista4.ex02.model;

import java.util.UUID;

public class Sala {
    private UUID id;
    private boolean estaAlugado;
    private String nomeLocatorio;

    public Sala() {
        this.id = UUID.randomUUID();
    }

    public Sala(boolean estaAlugado, String nomeLocatorio) {
        this.id = UUID.randomUUID();
        this.estaAlugado = estaAlugado;
        this.nomeLocatorio = nomeLocatorio;
    }

    public UUID getId() {
        return id;
    }

    public boolean isEstaAlugado() {
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
