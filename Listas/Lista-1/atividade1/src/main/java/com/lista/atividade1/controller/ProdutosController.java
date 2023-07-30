package com.lista.atividade1.controller;

import com.lista.atividade1.model.Produto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutosController {

    private List<Produto>produtos = new ArrayList<>();

    public ProdutosController(){
        produtos.add(new Produto(001,"farinha de aveia",20));
        produtos.add(new Produto(002,"castanhas",10));
        produtos.add(new Produto(003,"farinha de maçã",1.99));
        produtos.add(new Produto(004,"proteina ",60));
        produtos.add(new Produto(005,"pote de amendoin",3.50));

    }
    @GetMapping()
    public List<Produto> getAll(){
        return produtos;
    }
    @GetMapping("/{codigoBarra}")
    public Produto getByCodigoBarra(@PathVariable int codigoBarra) {
        for (Produto produto : produtos) {
            if (produto.getCodigoBarra() == codigoBarra) {
                return produto;
            }
        }
        return null;
    }
    @PostMapping
    public String save(@RequestBody Produto produto){
        for(Produto i: produtos)
        {
            if (produto.getCodigoBarra() != i.getCodigoBarra()){
                this.produtos.add(produto);
                return "O produto" + produto.getNome() + "foi cadastrado com sucesso";
            }
        }
        return "Esse produto ja foi cadastrado anteriormente";


    }
}
