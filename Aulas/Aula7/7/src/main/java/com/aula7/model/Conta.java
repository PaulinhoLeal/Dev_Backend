package com.aula7.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Conta {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    private String nome;
    @OneToMany(mappedBy = "conta", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("conta")
    private List<Jogo> jogos;

    @OneToMany(mappedBy = "conta",cascade = CascadeType.ALL)
    @JsonIgnoreProperties("conta")
    private List<Usuario> usuarios;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
