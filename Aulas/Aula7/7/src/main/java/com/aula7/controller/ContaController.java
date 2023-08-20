package com.aula7.controller;

import com.aula7.model.Conta;
import com.aula7.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.parser.Entity;
import java.util.List;

@RestController
@RequestMapping("/contas")
@CrossOrigin
public class ContaController {

    @Autowired
    ContaService contaService;

    @GetMapping
    public ResponseEntity<List<Conta>> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(contaService.getAll());
    }
    @PostMapping
    public ResponseEntity<Conta> save(@RequestBody Conta conta){
        return ResponseEntity.status(HttpStatus.CREATED).body(conta);
    }
}
