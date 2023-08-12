package com.lista4.ex02.service;

import com.lista4.ex02.model.Sala;
import com.lista4.ex02.repository.BancoDados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaService {
    @Autowired
    private BancoDados bancoDados;


    public List<Sala> findAll(){
        return bancoDados.findAll();
    }
}
