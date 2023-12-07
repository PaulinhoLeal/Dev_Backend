import { Component, Input } from '@angular/core';
import { Cosmetico } from 'src/app/model/cosmetico';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css'],
})
export class CardComponent {
  @Input() cosmetico!: Cosmetico;
}
