package com.aula7.service;

import com.aula7.model.Jogo;
import com.aula7.repository.BancoDeDados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogoService {

    @Autowired
    private BancoDeDados bancoDeDados;

    public List<Jogo> getAll(){
        return bancoDeDados.findAll();
    }
    public Jogo save(Jogo jogo){
       return bancoDeDados.save(jogo);
    }
}
