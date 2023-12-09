package com.lista3.ex01.repository;

import com.lista3.ex01.model.Cosmetico;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BancoDados {
    private List<Cosmetico> cosmeticos = new ArrayList<>();

    public List<Cosmetico> findAll() {
        return cosmeticos;
    }

    public String delete(String nome) {
        if (cosmeticos.isEmpty()) {
            return "Produto inexistente!";
        }

        for (Cosmetico cosmetico : cosmeticos) {
            if (cosmetico.getNome().equalsIgnoreCase(nome)) {
                cosmeticos.remove(cosmetico);
                return cosmetico.getNome() + " deletado!";
            }
        }

        return "Produto inexistente!";
    }
}
