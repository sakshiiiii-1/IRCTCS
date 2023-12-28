import { TestBed } from '@angular/core/testing'

import { AdminStationService } from './admin-station.service'

describe('AdminStationService', () => {
  let service: AdminStationService

  beforeEach(() => {
    TestBed.configureTestingModule({})
    service = TestBed.inject(AdminStationService)
  })

  it('should be created', () => {
    expect(service).toBeTruthy()
  })
})
