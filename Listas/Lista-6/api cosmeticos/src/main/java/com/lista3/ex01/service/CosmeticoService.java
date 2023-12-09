package com.lista3.ex01.service;

import com.lista3.ex01.model.Cosmetico;
import com.lista3.ex01.repository.BancoDados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CosmeticoService {

   @Autowired
   private BancoDados bancoDeDados;

   public List<Cosmetico> findAll() {
      return bancoDeDados.findAll();
   }

   public Cosmetico getByNome(String nome) {
      for (Cosmetico cosmetico : bancoDeDados.findAll()) {
         if (cosmetico.getNome().equalsIgnoreCase(nome)) {
            return cosmetico;
         }
      }
      return null;
   }

   public String save(Cosmetico cosmetico) {
      for (Cosmetico listaCosmetico : bancoDeDados.findAll()) {
         if (listaCosmetico.getNome().equalsIgnoreCase(cosmetico.getNome())) {
            return cosmetico.getNome() + " ja existe!";
         }
      }
      bancoDeDados.findAll().add(cosmetico);
      return cosmetico.getNome() + " cadastrado!";
   }

   public String delete(String nome) {
      return bancoDeDados.delete(nome);
   }
}
