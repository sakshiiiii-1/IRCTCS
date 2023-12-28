import { CommonModule } from '@angular/common'
import { Component } from '@angular/core'
import { FormsModule } from '@angular/forms'
import { Station } from '../../classes/Station'
import { StationTrainResponse } from '../../classes/StationTrainResponse'
import { AdminStationService } from '../../services/adminStation/admin-station.service'

@Component({
  selector: 'app-admin-station',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './admin-station.component.html',
  styleUrl: './admin-station.component.css',
})
export class AdminStationComponent {
  StationList: Station[] = []

  StationData = new Station(0, '', '', '', '', '', 0, 0, 0, 0, 0, 0, 0, 0, new Date())

  station!: Station

  constructor(private stationService: AdminStationService) {}
  ngOnInit(): void {
    this.getAllStation()
  }
  getAllStation(): void {
    this.stationService
      .getAllStations()
      .subscribe((data) => [(this.StationList = data), console.log(data)]),
      (error: any) => {
        console.error('Error loading station data:', error)
      }
  }
  deleteStations(stationId: number): void {
    this.stationService
      .deleteStations(stationId)
      .subscribe(() => [alert('Deleted Stations'), this.getAllStation()]),
      (error: any) => {
        console.error('Error deleting Passenger data:', error)
      }
  }

  addStations(): void {
    this.stationService
      .addStations(this.StationData)
      .subscribe(() => [alert('station added'), this.addStations()]),
      (error: any) => {
        console.error('Error adding stations:', error)
      }
  }
}
