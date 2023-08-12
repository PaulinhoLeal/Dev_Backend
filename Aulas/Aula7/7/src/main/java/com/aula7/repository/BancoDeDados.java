package com.aula7.repository;

import com.aula7.model.Jogo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class BancoDeDados {

    private List<Jogo>jogos = new ArrayList<>();


    public BancoDeDados(){
        this.jogos.add(new Jogo(1,"Chrono Trigger","Rpg de viagem no tempo",10.00,"https://www.google.com/imgres?imgurl=https%3A%2F%2Fstatic.wixstatic.com%2Fmedia%2F1ddfcf_db78d4a2073a464180bac035398bc4aa~mv2.jpg%2Fv1%2Ffit%2Fw_500%2Ch_500%2Cq_90%2Ffile.jpg&tbnid=YIJvp76m2U9pzM&vet=12ahUKEwjd_Y_Qq7aAAxXjqJUCHd4EC18QMygJegUIARDiAQ..i&imgrefurl=https%3A%2F%2Fwww.3dbox.com.br%2Fproduct-page%2F3dbox-chrono-trigger-45x33-c-led&docid=nY7wQI9OsnlR-M&w=500&h=500&q=chrono%20trigger%20500x500&ved=2ahUKEwjd_Y_Qq7aAAxXjqJUCHd4EC18QMygJegUIARDiAQ",false));
        this.jogos.add(new Jogo(2,"God of war","Slash, mitologia grega",50.00,"https://www.google.com/imgres?imgurl=https%3A%2F%2Fd3alv7ekdacjys.cloudfront.net%2FCustom%2FContent%2FProducts%2F11%2F89%2F1189222_jogo-ps5-god-of-war-ragnarok_m2_638006539696141504.jpg&tbnid=BCNMGMcD6sJk-M&vet=12ahUKEwjtlLiks7aAAxVbBLkGHY2cAncQMygAegUIARDNAQ..i&imgrefurl=https%3A%2F%2Fwww.schumann.com.br%2Fjogo-ps5-god-of-war-ragnarok-p1189222&docid=MU5s3iOXXu8h6M&w=500&h=500&q=gof%20of%20war%20500x500&ved=2ahUKEwjtlLiks7aAAxVbBLkGHY2cAncQMygAegUIARDNAQ",false));
        this.jogos.add(new Jogo(3,"Resident evil 4","Terror, Leon um agente do governo é contratado para salvar a filha do presidente de zumbis",50.00,"https://www.google.com/imgres?imgurl=https%3A%2F%2Fhttp2.mlstatic.com%2FD_NQ_NP_812572-MLB54284679696_032023-O.webp&tbnid=inhGeTsUxlowTM&vet=12ahUKEwjs7rm6s7aAAxV0DdQKHZqAChUQMygKegUIARDkAQ..i&imgrefurl=https%3A%2F%2Fwww.descontonopreco.com.br%2Fofertas%2Fmercadolivre%2F3502059&docid=C4GMTE334XEqSM&w=500&h=500&q=resident%20evil%204%20500x500&ved=2ahUKEwjs7rm6s7aAAxV0DdQKHZqAChUQMygKegUIARDkAQ",false));
    }

    public List<Jogo> findAll(){
        return jogos;
    }

    public Jogo save(Jogo jogo){
        for(Jogo jogoNaLista:jogos){
            if(jogoNaLista.getId()==jogo.getId()){
                return null;
            }
        }
        jogos.add(jogo);
        return jogo;
    }

}
