package com.lista4.ex02.controller;

import com.lista4.ex02.model.Sala;
import com.lista4.ex02.service.SalaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/salas")
public class SalaController {

    @Autowired
    SalaService service;

    @GetMapping
    public List<Sala> findAll() {
        return service.findAll();
    }

    @PostMapping
    public String addSala(@RequestBody Sala sala) {
        return service.addSala(sala);
    }

    @PutMapping("/{nomeLocatorio}")
    public String alugarSala(@PathVariable String nomeLocatorio) {
        return service.verificaSala(nomeLocatorio);
    }

}
