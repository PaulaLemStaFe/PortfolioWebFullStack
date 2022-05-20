import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HabilidadesblandasComponent } from './habilidadesblandas.component';

describe('HabilidadesblandasComponent', () => {
  let component: HabilidadesblandasComponent;
  let fixture: ComponentFixture<HabilidadesblandasComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HabilidadesblandasComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(HabilidadesblandasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
