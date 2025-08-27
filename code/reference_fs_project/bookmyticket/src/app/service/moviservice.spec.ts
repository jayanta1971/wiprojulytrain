import { TestBed } from '@angular/core/testing';

import { Moviservice } from './moviservice';

describe('Moviservice', () => {
  let service: Moviservice;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(Moviservice);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
