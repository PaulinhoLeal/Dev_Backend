package com.lista4.ex02.service;

import com.lista4.ex02.model.Sala;
import com.lista4.ex02.repository.BancoDados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaService {
    @Autowired
    private BancoDados bancoDados;

    public List<Sala> findAll() {
        return bancoDados.findAll();
    }

    public String addSala(Sala sala) {
        for (Sala salaI : bancoDados.findAll()) {
            if (salaI.getNomeLocatorio().equalsIgnoreCase(sala.getNomeLocatorio())) {
                return "Sala já existente!";
            }
        }
        bancoDados.addSala(sala);
        return sala.getNomeLocatorio() + " adicionada!";
    }

    public String verificaSala(String nomeLocatorio) {
        if (bancoDados.estaAlugada(nomeLocatorio)) {
            return "Sala indisponivel!";
        }
        return "Parabens. Sala alugada!";
    }
}
