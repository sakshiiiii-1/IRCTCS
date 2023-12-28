import { CommonModule } from '@angular/common'
import { Component, OnInit } from '@angular/core'
import { FormsModule } from '@angular/forms'
import { Passenger } from '../../classes/passengers'
import { PassengersService } from '../../services/passengers/passengers.service'
import { error } from 'console'
import { ActivatedRoute, NavigationExtras, Router } from '@angular/router'
import { Station } from '../../classes/Station'
import { TrainData } from '../../classes/train-data'

@Component({
  selector: 'app-passengers',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './passengers.component.html',
  styleUrl: './passengers.component.css',
})
export class PassengersComponent implements OnInit {
  passengerDetails: Passenger[] = [new Passenger(0, '', 0, 0, '', '')]
  passengerCount!: number

  constructor(
    private passengerService: PassengersService,
    private route: ActivatedRoute,
    private router: Router,
  ) {}

  addPassenger() {
    return this.passengerService.addPassengers(this.passengerDetails).subscribe(
      (data) => {
        console.log(this.passengerDetails)
        this.passengerCount = this.passengerDetails.length
        console.log('count is ', this.passengerCount)
        this.passengerDetails = [new Passenger(0, '', 0, 0, '', '')]
      },

      (error) => console.error('Unable to add'),
    )
  }

  station!: Station
  train!: TrainData
  price!: number
  tclass!: string
  tAvail!: number
  ngOnInit() {
    this.route.paramMap.subscribe((params) => {
      this.station = history.state.station as Station
      this.train = history.state.train as TrainData
      this.price = history.state.price
      this.tclass = history.state.tclass
      this.tAvail = history.state.tAvail
      console.log(this.station)
      console.log(this.train)
      console.log(this.price)
      console.log(this.tclass)
      console.log(this.tAvail)
      // Now you have access to the station and train objects
    })
  }

  addAnotherPassenger() {
    this.passengerDetails.push(new Passenger(0, '', 0, 0, '', ''))
  }

  goToCart() {
    const navigationExtras: NavigationExtras = {
      state: {
        station: this.station,
        train: this.train,
        price: this.price,
        tclass: this.tclass,
        passengerDetails: this.passengerDetails,
        passengerCount: this.passengerCount,
        tAvail: this.tAvail,
      },
    }
    this.router.navigate(['cart'], navigationExtras)
  }
}
