package com.aula7.controller;

import com.aula7.model.Categoria;
import com.aula7.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria")
@CrossOrigin
public class CategoriaController {

    @Autowired
    CategoriaService categoriaService;

    @GetMapping
    public ResponseEntity<List<Categoria>> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(categoriaService.getAll());
    }
    @PostMapping
    public ResponseEntity<Categoria> save(@RequestBody Categoria categoria){
        return  ResponseEntity.status(HttpStatus.CREATED).body(categoriaService.save(categoria));
    }
}
