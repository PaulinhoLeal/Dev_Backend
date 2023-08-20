package com.aula7.controller;

import com.aula7.model.Conta;
import com.aula7.model.Usuario;
import com.aula7.repository.UsuarioRepository;
import com.aula7.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<List<Usuario>> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(usuarioService.getAll());
    }
    @PostMapping
    public ResponseEntity<Usuario> save(@RequestBody Usuario usuario){
        return ResponseEntity.status(HttpStatus.CREATED).body(usuario);
    }


}
