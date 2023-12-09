package com.lista.atividade2.controller;

import com.lista.atividade2.model.Jogo;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/jogos")
public class JogoController {
    private List<Jogo> jogos = new ArrayList<>();

    @GetMapping
    public List<Jogo> getAll() {
        return jogos;
    }

    @GetMapping("{name}")
    public Jogo getByName(@PathVariable String name) {
        for (Jogo jogo : jogos) {
            if (jogo.getNome().equals(name)) {
                return jogo;
            }
        }
        return null;
    }

    @PostMapping
    public String save(@RequestBody Jogo reqJogo) {
        for (Jogo jogo : jogos) {
            if (jogo.getNome().equalsIgnoreCase(reqJogo.getNome())) {
                return "Jogo já cadastrado!";
            }
        }
        jogos.add(reqJogo);
        return reqJogo.getNome() + " cadastrado!";
    }
}
