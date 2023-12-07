package com.lista4.ex02.repository;

import com.lista4.ex02.model.Sala;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BancoDados {
    List<Sala> salas = new ArrayList<>();

    public List<Sala> findAll() {
        return salas;
    }

    public void addSala(Sala sala) {
        salas.add(sala);
    }

    public boolean estaAlugada(String nomeLocatorio) {
        for (Sala sala : salas) {
            if (sala.getNomeLocatorio().equalsIgnoreCase(nomeLocatorio)) {
                if (sala.isEstaAlugado()) {
                    return true;
                } else {
                    sala.setEstaAlugado(!sala.isEstaAlugado());
                }
            }
        }
        return false;
    }

}
