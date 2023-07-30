package com.lista3.ex01.service;

import com.lista3.ex01.model.Cosmetico;
import com.lista3.ex01.repository.BancoDados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class CosmeticoService {
   @Autowired
   private BancoDados bancoDados;
   public List<Cosmetico> findAll(){
      return bancoDados.findAll();
   }


   public Cosmetico getByid(int id){
      List<Cosmetico>cosmeticos = bancoDados.findAll();
      for(Cosmetico cosmetico:cosmeticos){
         if (cosmetico.getId()==id){
            return cosmetico;
         }
      }
      return null;
   }
   public String cadastrarCosmetico(Cosmetico cosmetico){
      List<Cosmetico>cosmeticos =bancoDados.findAll();

      for (Cosmetico listaCosmetico:cosmeticos){
         if (listaCosmetico.getId()==cosmetico.getId()){

            return "O cosmetico"+ cosmetico.getNome()+"ja existe!";
         }
      }
         cosmeticos.add(cosmetico);
         return "Cosmetico"+ cosmetico.getNome()+"cadastrado! ";
   }

   public String delete(int id){
      return bancoDados.delete(id);
   }
}
