package com.lista3.ex01.controller;

import com.lista3.ex01.model.Cosmetico;
import com.lista3.ex01.service.CosmeticoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/cosmeticos")
public class CosmeticoController {

    @Autowired
    private CosmeticoService service;

    @GetMapping
    public List<Cosmetico> getAll() {
        return service.findAll();
    }

    @GetMapping("/{nome}")
    public Cosmetico getByNome(@PathVariable String nome) {
        return service.getByNome(nome);
    }

    @PostMapping
    public String addCosmetico(@RequestBody Cosmetico cosmetico) {
        return service.save(cosmetico);
    }

    @DeleteMapping("/{nome}")
    public String deleteCosmetico(@PathVariable String nome) {
        return service.delete(nome);
    }

}
