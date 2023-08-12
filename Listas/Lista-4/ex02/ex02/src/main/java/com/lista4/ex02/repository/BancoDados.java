package com.lista4.ex02.repository;

import com.lista4.ex02.model.Sala;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class BancoDados {
  List<Sala>salas;

  private BancoDados (Sala sala){
      salas.add(new Sala(1,true,"nippon"));
      salas.add(new Sala(2,false,null));
      salas.add(new Sala(3,false,null));
      salas.add(new Sala(4,false,null));
      salas.add(new Sala(5,true,"Hayato"));
      salas.add(new Sala(6,false,null));
      salas.add(new Sala(7,true,"Naomi san"));
      salas.add(new Sala(8,false,null));
  }

  public List<Sala> findAll(){
      return salas;
  }

  public boolean alugarSala(Sala sala){

      for (Sala listaSala:salas){
          if (sala.getEstaAlugado()==true){

              return false;
          }
      }
        return true;
    }


}
