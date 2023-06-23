package com.lista.atividade2.controller;

import com.lista.atividade2.model.Jogo;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/jogos")
public class JogoController {

    private List<Jogo> jogos = new ArrayList<>();

    public JogoController(){
        jogos.add(new Jogo(1,"dark souls",30));
        jogos.add(new Jogo(2,"rainbow six",20.99));
        jogos.add(new Jogo(3,"fifa",2));
        jogos.add(new Jogo(4,"CHRONO TRIGGER",10000));
    }

    @GetMapping
    public List<Jogo> getAll(){
        return jogos;
    }
    @GetMapping("/{id}")
    public Jogo getById(@PathVariable int id)
    {
        for(Jogo jogo: jogos)
        {
            if (jogo.getId() == id)
            {
                return jogo;
            }
        }
        return null;
    }

   @PostMapping
    public String save(@RequestBody Jogo jogo){
        for (Jogo idIgual: jogos)
        {
            if(jogo.getId()!= idIgual.getId())
            {
                this.jogos.add(jogo);
                return "Jogo cadastrado com sucesso:"+jogo.getNome();
            }
        }
        return "Jogo ja cadastrado anteriormente";
   }
}
