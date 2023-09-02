package com.lista3.ex01.repository;

import com.lista3.ex01.model.Cosmetico;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
@Component
public class BancoDados {



    private List<Cosmetico>cosmeticos = new ArrayList<>();


    public BancoDados(){
        cosmeticos.add(new Cosmetico(1,"Shampoo",new BigDecimal(20.00),"/img/shampo"));
        cosmeticos.add(new Cosmetico(2,"Condicionador",new BigDecimal(20.00),"/img/condicionador"));
        cosmeticos.add(new Cosmetico(3,"Protetor-solar",new BigDecimal(40.00),""));
        cosmeticos.add(new Cosmetico(4,"Creme de pele",new BigDecimal(15.99),""));
        cosmeticos.add(new Cosmetico(5,"Sabonete",new BigDecimal(10.00),""));
        cosmeticos.add(new Cosmetico(6,"Creme dental",new BigDecimal(7.99),""));
    }

    public List<Cosmetico> findAll(){
        return cosmeticos;

    }

    public String delete(int id){
        for (Cosmetico cosmetico:cosmeticos){
            if(cosmetico.getId()==id){
                 cosmeticos.remove(cosmetico);
                 return "Cosmetico "+ cosmetico.getNome()+ " removido";
            }
        }
        return "Produto inexistente";
    }
}
