import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ConocimientosinformaticosComponent } from './conocimientosinformaticos.component';

describe('ConocimientosinformaticosComponent', () => {
  let component: ConocimientosinformaticosComponent;
  let fixture: ComponentFixture<ConocimientosinformaticosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ConocimientosinformaticosComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ConocimientosinformaticosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
