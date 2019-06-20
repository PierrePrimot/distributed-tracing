import { TestBed } from '@angular/core/testing';

import { HWServiceService } from './hwservice.service';

describe('HWServiceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: HWServiceService = TestBed.get(HWServiceService);
    expect(service).toBeTruthy();
  });
});
