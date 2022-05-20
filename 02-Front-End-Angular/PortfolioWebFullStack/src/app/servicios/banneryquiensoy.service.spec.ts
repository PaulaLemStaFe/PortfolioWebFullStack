import { TestBed } from '@angular/core/testing';

import { BanneryquiensoyService } from './banneryquiensoy.service';

describe('BanneryquiensoyService', () => {
  let service: BanneryquiensoyService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(BanneryquiensoyService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
