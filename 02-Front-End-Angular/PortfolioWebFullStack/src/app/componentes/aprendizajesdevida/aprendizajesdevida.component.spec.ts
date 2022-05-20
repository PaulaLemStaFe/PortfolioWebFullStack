import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AprendizajesdevidaComponent } from './aprendizajesdevida.component';

describe('AprendizajesdevidaComponent', () => {
  let component: AprendizajesdevidaComponent;
  let fixture: ComponentFixture<AprendizajesdevidaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AprendizajesdevidaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AprendizajesdevidaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
