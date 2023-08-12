package com.example.lista_3.controller;

import com.example.lista_3.model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/envio")
public class DeliveryController {
    @Autowired
    DeliveryController deliveryController;

    @PostMapping
    public String enviarProduto(@RequestBody Produto produto){
        return deliveryController.enviarProduto(produto);
    }



}
