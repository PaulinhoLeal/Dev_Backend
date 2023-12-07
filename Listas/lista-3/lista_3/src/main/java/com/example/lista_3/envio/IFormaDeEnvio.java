package com.example.lista_3.envio;

import com.example.lista_3.model.Produto;
import org.springframework.stereotype.Component;

@Component
public interface IFormaDeEnvio {
    public String envio(Produto produto);
}
