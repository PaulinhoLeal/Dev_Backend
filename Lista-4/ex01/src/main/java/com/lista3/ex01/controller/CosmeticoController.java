package com.lista3.ex01.controller;

import com.lista3.ex01.model.Cosmetico;
import com.lista3.ex01.repository.BancoDados;
import com.lista3.ex01.service.CosmeticoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cosmeticos")
public class CosmeticoController {
    @Autowired
    private CosmeticoService cosmeticoService;

    @GetMapping
    public List<Cosmetico> getAll(){
        return cosmeticoService.findAll();
    }

    @GetMapping("/{id}")
    public Cosmetico getById(@PathVariable int id){
        return cosmeticoService.getByid(id);
    }

    @PostMapping
    public String cadastrarCosmetico(@RequestBody Cosmetico cosmetico){
        return cosmeticoService.cadastrarCosmetico(cosmetico);
    }

    @DeleteMapping("/{id}")
    public String delete(int id){
        return cosmeticoService.delete(id);
    }

}
