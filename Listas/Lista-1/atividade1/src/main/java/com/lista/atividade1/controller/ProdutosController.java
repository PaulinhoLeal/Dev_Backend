package com.lista.atividade1.controller;

import com.lista.atividade1.model.Produto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutosController {
    private List<Produto> produtos = new ArrayList<>();

    @GetMapping()
    public List<Produto> getAll() {
        return produtos;
    }

    @GetMapping("{name}")
    public Produto getByName(@PathVariable String name) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(name)) {
                return produto;
            }
        }
        return null;
    }

    @PostMapping
    public String save(@RequestBody Produto bodyProduto) {
        for (Produto produto : produtos) {
            if (bodyProduto.getNome().equals(produto.getNome())) {
                return "Esse produto já existente!";
            }
        }
        produtos.add(bodyProduto);
        return "Produto \"" + bodyProduto.getNome() + "\" cadastrado";
    }
}
