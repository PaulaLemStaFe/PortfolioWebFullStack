import { TestBed } from '@angular/core/testing';

import { ConocimientosinformaticosService } from './conocimientosinformaticos.service';

describe('ConocimientosinformaticosService', () => {
  let service: ConocimientosinformaticosService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ConocimientosinformaticosService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
