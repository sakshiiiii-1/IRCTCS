import { TestBed } from '@angular/core/testing';

import { AdminPassengerService } from './admin-passenger.service';

describe('AdminPassengerService', () => {
  let service: AdminPassengerService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AdminPassengerService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
