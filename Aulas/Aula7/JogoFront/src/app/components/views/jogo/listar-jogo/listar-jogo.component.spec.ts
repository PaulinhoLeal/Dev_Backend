import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListarJogoComponent } from './listar-jogo.component';

describe('ListarJogoComponent', () => {
  let component: ListarJogoComponent;
  let fixture: ComponentFixture<ListarJogoComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ListarJogoComponent]
    });
    fixture = TestBed.createComponent(ListarJogoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
