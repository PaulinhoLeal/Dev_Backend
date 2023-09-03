import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { BehaviorSubject, Observable } from 'rxjs';
import { Jogo } from '../model/jogo';

@Injectable({
  providedIn: 'root'
})
export class JogoService {
  private rota:string = "http://localhost:8080/jogos"
  private jogoASerExcluidoSubject = new BehaviorSubject<any>(null);
  jogoASerExcluido$ = this.jogoASerExcluidoSubject.asObservable();

  constructor(private httpClient:HttpClient) { }

  public getJogos():Observable<Jogo[]>{
    return this.httpClient.get<Jogo[]>(this.rota);
  }

  public postJogo(jogo:Jogo):Observable<Jogo>{
    return this.httpClient.post<Jogo>(this.rota, jogo);
  }

  public favoritarJogo(id:number): Observable<Jogo>{
    return this.httpClient.put<Jogo>(this.rota + "/favoritar/" + id, null )
  } 

  setjogoASerExcluido(jogo:any){
    this.jogoASerExcluidoSubject.next(jogo);
  }
  deleteJogo(id:number){
    console.log("chamou service jogo");
    this.httpClient.delete(this.rota + "/" + id).subscribe();
    window.location.reload();
  }


}

