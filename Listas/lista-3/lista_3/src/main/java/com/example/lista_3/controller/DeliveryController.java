package com.example.lista_3.controller;

import com.example.lista_3.model.Produto;
import com.example.lista_3.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/envio")
public class DeliveryController {
    @Autowired
    DeliveryService service;

    @PostMapping
    public String enviarProduto(@RequestBody Produto produto) {
        return service.enviar(produto);
    }

}
