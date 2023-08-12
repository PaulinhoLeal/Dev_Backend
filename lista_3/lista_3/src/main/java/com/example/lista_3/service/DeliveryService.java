package com.example.lista_3.service;

import com.example.lista_3.envio.FormaDeEnvio;
import com.example.lista_3.model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DeliveryService {
    @Autowired
    @Qualifier("EnvioViaDrome")
    private FormaDeEnvio formaDeEnvio;

    public String enviar(Produto produto){
       return formaDeEnvio.envio(produto);
    }

}
