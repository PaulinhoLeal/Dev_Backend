import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Cosmetico } from '../model/cosmetico';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class CosmeticoService {
  public rota: string = 'http://localhost:8080/cosmeticos';

  constructor(private httpClient: HttpClient) {}

  public getCosmeticos(): Observable<Cosmetico[]> {
    return this.httpClient.get<Cosmetico[]>(this.rota + '/');
  }
}
