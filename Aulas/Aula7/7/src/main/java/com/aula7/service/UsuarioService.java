package com.aula7.service;

import com.aula7.model.Usuario;
import com.aula7.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> getAll(){
        return usuarioRepository.findAll();
    }
    public Usuario save(Usuario usuario){
        return usuarioRepository.save(usuario);
    }
}
