import { CommonModule } from '@angular/common'
import { Component, OnInit } from '@angular/core'
import { FormsModule } from '@angular/forms'
import { ActivatedRoute, Router } from '@angular/router'
import { Station } from '../../classes/Station'
import { TrainData } from '../../classes/train-data'
import { Passenger } from '../../classes/passengers'
import { TicketUpdateService } from '../../services/station/tickets/ticket-update.service'

@Component({
  selector: 'app-cart',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './cart.component.html',
  styleUrl: './cart.component.css',
})
export class CartComponent implements OnInit {
  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private ticketService: TicketUpdateService,
  ) {}

  station!: Station
  train!: TrainData
  price!: number
  tclass!: string
  tAvail!: number
  passengerDetails!: Passenger[]
  passengerCount: number = 0
  totalSum: number = 0
  newwww!: number

  ngOnInit() {
    this.route.paramMap.subscribe((params) => {
      this.station = history.state.station as Station
      this.train = history.state.train as TrainData
      this.price = history.state.price
      this.tclass = history.state.tclass
      this.passengerDetails = history.state.passengerDetails as Passenger[]

      // Calculate passengerCount and totalSum
      this.passengerCount = this.passengerDetails.length
      this.totalSum = this.price * this.passengerCount
      this.tAvail = history.state.tAvail
      this.newwww = this.tAvail - this.passengerCount

      console.log(this.station)
      console.log(this.train)
      console.log(this.price)
      console.log(this.tclass)
      console.log(this.passengerDetails)
      console.log(this.passengerCount)
      console.log(this.totalSum)
    })
  }

  goToPayment() {
    const stationId = this.station.stationId; // Replace with the actual property name
  const tclass = this.tclass;
  const newwww = this.newwww;

  this.ticketService.updateTickets(stationId, tclass, newwww).subscribe(
    () => {
      console.log("Tickets updated successfully.");
      this.router.navigate(['payment']);
    },
    (error) => {
      console.error("Error updating tickets:", error);
      // Handle the error as needed
    }
  );
  console.log(newwww);
  }
}
