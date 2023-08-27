package com.aula7.controller;

import com.aula7.model.Jogo;
import com.aula7.service.JogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jogos")
@CrossOrigin("*")
public class
JogoController {

    @Autowired
    private JogoService jogoService;


    @GetMapping
    public ResponseEntity<List<Jogo>> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(jogoService.getAll());
    }
    @PostMapping
    public ResponseEntity<Jogo> save(@RequestBody Jogo jogo){
        Jogo jogoRetornado = jogoService.save(jogo);

        if(jogoRetornado==null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(jogo);
    }

    @PutMapping("/favoritar/{id}")
    public ResponseEntity<Jogo> favoritar(@PathVariable int id){
        Jogo jogo = jogoService.favoritar(id);
        return ResponseEntity.status(HttpStatus.OK).body(jogo);
    }
}
