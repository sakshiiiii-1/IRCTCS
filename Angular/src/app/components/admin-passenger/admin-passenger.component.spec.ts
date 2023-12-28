import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminPassengerComponent } from './admin-passenger.component';

describe('AdminPassengerComponent', () => {
  let component: AdminPassengerComponent;
  let fixture: ComponentFixture<AdminPassengerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [AdminPassengerComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(AdminPassengerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
