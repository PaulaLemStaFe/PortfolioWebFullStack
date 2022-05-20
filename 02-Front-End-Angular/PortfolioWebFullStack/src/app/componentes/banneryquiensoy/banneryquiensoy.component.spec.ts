import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BanneryquiensoyComponent } from './banneryquiensoy.component';

describe('BanneryquiensoyComponent', () => {
  let component: BanneryquiensoyComponent;
  let fixture: ComponentFixture<BanneryquiensoyComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BanneryquiensoyComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(BanneryquiensoyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
