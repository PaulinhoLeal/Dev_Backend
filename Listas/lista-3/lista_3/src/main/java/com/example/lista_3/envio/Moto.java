package com.example.lista_3.envio;

import com.example.lista_3.model.Produto;
import org.springframework.stereotype.Component;

@Component("moto")
public class Moto implements IFormaDeEnvio {
    @Override
    public String envio(Produto produto) {
        return produto.getNome() + " entregue via Moto";
    }
}
