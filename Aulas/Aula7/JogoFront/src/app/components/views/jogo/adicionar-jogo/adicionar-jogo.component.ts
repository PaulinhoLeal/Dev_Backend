import { Component, OnInit } from '@angular/core';
import { Jogo } from 'src/app/model/jogo';
import { JogoService } from 'src/app/services/jogo.service';

@Component({
  selector: 'app-adicionar-jogo',
  templateUrl: './adicionar-jogo.component.html',
  styleUrls: ['./adicionar-jogo.component.css']
})
export class AdicionarJogoComponent implements OnInit {
  jogo:Jogo = new Jogo;

  constructor(private jogoService:JogoService){}

  ngOnInit(): void {
    
  }

  saveJogo(){
    this.jogoService.postJogo(this.jogo).subscribe(res=>{
      alert("o jogo " + this.jogo.nome)

    })
  }


}
