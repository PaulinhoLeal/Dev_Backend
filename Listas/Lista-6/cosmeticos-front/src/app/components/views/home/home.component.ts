import { Component, OnInit } from '@angular/core';
import { Cosmetico } from 'src/app/model/cosmetico';
import { CosmeticoService } from 'src/app/services/cosmetico.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css'],
})
export class HomeComponent implements OnInit {
  cosmeticos: Cosmetico[] = [];

  constructor(private cosmeticoService: CosmeticoService) {}

  ngOnInit(): void {
    this.getCosmeticos();
  }

  getCosmeticos() {
    this.cosmeticoService.getCosmeticos().subscribe((response) => {
      this.cosmeticos = response;
    });
  }
}
