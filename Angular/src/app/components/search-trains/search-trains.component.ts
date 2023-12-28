import { CommonModule } from '@angular/common'
import { Component } from '@angular/core'
import { FormsModule } from '@angular/forms'
import { SearchStation } from '../../classes/SearchStation'
import { SearchService } from '../../services/search/search.service'
import { StationTrainResponse } from '../../classes/StationTrainResponse'
import { error } from 'console'
import { NavigationExtras, Router } from '@angular/router'
import { Station } from '../../classes/Station'
import { TrainData } from '../../classes/train-data'

@Component({
  selector: 'app-search-trains',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './search-trains.component.html',
  styleUrl: './search-trains.component.css',
})
export class SearchTrainsComponent {

  selectedCardIndex: number | null = null;

  
  stationData = new SearchStation('', '')

  stationTrainResponse!: StationTrainResponse

  station!: Station;
  train!: TrainData;
  price!: number;
  tclass!: string;
  tAvail!: number;
  constructor(private searchService: SearchService, private router: Router) {}

  getTrains() {
    return this.searchService.searchTrains(this.stationData).subscribe(
      (data) => {
        console.log(data), (this.stationTrainResponse = data)
      },
      (error) => console.error('Error in authentication:', error),
    )
  }

 bookTrain(station: Station, train: TrainData) {
    const navigationExtras: NavigationExtras = {
      state: { station, train , price: this.price, tclass: this.tclass, tAvail:this.tAvail}
    };

    this.router.navigate(['passengers'], navigationExtras);
  }

  priceAndClassSelected(price: number, tclass:  string, tAvail: number) {

    // Handle the selected price as needed
    this.price = price;
    this.tclass = tclass;
    this.tAvail = tAvail;
    console.log('Selected Price:', price, tclass, tAvail);
  }

  handleCartClick(index: number) {
    if (this.selectedCardIndex === index) {
      // Deselect the card if it's already selected
      this.selectedCardIndex = null;
    } else {
      // Select the clicked card
      this.selectedCardIndex = index;
    }
  }


}
