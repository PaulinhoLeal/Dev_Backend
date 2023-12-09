package com.lista2.ex01.controller;

import com.lista2.ex01.models.EnderecoModel;
import com.lista2.ex01.serivce.EnderecoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {
    @Autowired
    EnderecoService service;

    @GetMapping("/{cep}")
    public EnderecoModel getByCep(@PathVariable String cep) {
        return service.getByCep(cep);
    }
}