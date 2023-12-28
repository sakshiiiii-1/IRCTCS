import { CommonModule } from '@angular/common'
import { Component } from '@angular/core'
import { FormsModule } from '@angular/forms'
import { Passenger } from '../../classes/passengers'
import { AdminPassengerService } from '../../services/adminPassenger/admin-passenger.service'

@Component({
  selector: 'app-admin-passenger',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './admin-passenger.component.html',
  styleUrl: './admin-passenger.component.css',
})
export class AdminPassengerComponent {
  passengerList: Passenger[] = []

  passenger = new Passenger(0, '', 0, 0, '', '')

  constructor(private passengerService: AdminPassengerService) {}
  ngOnInit(): void {
    this.getAllPassengers()
  }

  getAllPassengers(): void {
    this.passengerService
      .getAllPassengers()
      .subscribe((data) => [(this.passengerList = data), console.log(data)]),
      (error: any) => {
        console.error('Error loading train data:', error)
      }
  }

  deletePassengers(passengerId: number): void {
    this.passengerService
      .deletePassengers(passengerId)
      .subscribe(() => [alert('Deleted Passengers'), this.getAllPassengers()]),
      (error: any) => {
        console.error('Error loading Passenger data:', error)
      }
  }
}
