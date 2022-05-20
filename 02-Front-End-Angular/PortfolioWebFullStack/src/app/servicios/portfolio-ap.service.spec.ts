import { TestBed } from '@angular/core/testing';

import { PortfolioApService } from './portfolio-ap.service';

describe('PortfolioApService', () => {
  let service: PortfolioApService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PortfolioApService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
