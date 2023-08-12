package com.lista2.ex01.controller;

import com.lista2.ex01.models.Endereco;
import com.lista2.ex01.models.EnderecoResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {

    @GetMapping("/{cep}")
    public Endereco getByCep(@PathVariable String cep) {
        String url = "https://viacep.com.br/ws/" + cep + "json/";
        RestTemplate restTemplate = new RestTemplate();
        Endereco endereco = restTemplate.getForObject(url, Endereco.class);
        return endereco;
    }
}