package com.lista4.ex02.controller;

import com.lista4.ex02.model.Sala;
import com.lista4.ex02.service.SalaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/salas")
public class SalaController {

    @Autowired
    SalaService salaService;

    @GetMapping
    public List<Sala> findAll(){
        return salaService.findAll();
    }


}
