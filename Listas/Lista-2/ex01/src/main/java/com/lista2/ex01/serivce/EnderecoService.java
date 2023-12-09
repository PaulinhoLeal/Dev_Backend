package com.lista2.ex01.serivce;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.lista2.ex01.models.EnderecoModel;

@Service
public class EnderecoService {
    private static final String VIA_CEP = "https://viacep.com.br/ws/";
    private static final String DATA_TYPE = "/json";

    public EnderecoModel getByCep(String cep) {
        RestTemplate restTemplate = new RestTemplate();
        String url = VIA_CEP + cep + DATA_TYPE;

        return restTemplate.getForObject(url, EnderecoModel.class);
    }
}