import { TestBed } from '@angular/core/testing';

import { MisproyectosService } from './misproyectos.service';

describe('MisproyectosService', () => {
  let service: MisproyectosService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(MisproyectosService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
