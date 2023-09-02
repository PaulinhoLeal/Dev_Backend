package com.example.lista_3.envio;

import com.example.lista_3.model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EnvioViaMoto implements  FormaDeEnvio{

    @Override
    public String envio(Produto produto) {
        return "Seu produto"+ produto.getNome() +" enviado via Moto";
    }

}

