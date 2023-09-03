import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ModalExclusaoComponent } from './modal-exclusao.component';

describe('ModalExclusaoComponent', () => {
  let component: ModalExclusaoComponent;
  let fixture: ComponentFixture<ModalExclusaoComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ModalExclusaoComponent]
    });
    fixture = TestBed.createComponent(ModalExclusaoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
