import { Component, OnInit } from '@angular/core'
import { TrainService } from '../../services/train/train.service'
import { TrainData } from '../../classes/train-data'
import { FormsModule } from '@angular/forms'
import { CommonModule } from '@angular/common'
import { Observable } from 'rxjs'
import { RouterLink } from '@angular/router'

@Component({
  selector: 'app-train',
  standalone: true,
  imports: [CommonModule, FormsModule, RouterLink],
  templateUrl: './train.component.html',
  styleUrl: './train.component.css',
})
export class TrainComponent implements OnInit {
  trainList: TrainData[] = []

  trainData = new TrainData('', '', '')

  constructor(private trainService: TrainService) {}
  ngOnInit(): void {
    this.getAllTrains()
  }

  getAllTrains(): void {
    this.trainService
      .getAllTrains()
      .subscribe((data) => [(this.trainList = data), console.log(data)]),
      (error: any) => {
        console.error('Error loading train data:', error)
      }
  }

  addTrains() {
    this.trainService
      .addTrains(this.trainData)
      .subscribe(() => [
        alert('Train added'),
        this.getAllTrains(),
        (this.trainData = new TrainData('', '', '')),
      ]),
      (error: any) => {
        console.error('Error loading train data:', error)
      }
  }

  DeleteTrain(trainId: number) {
    this.trainService
      .deleteTrain(trainId)
      .subscribe(() => [alert('Deleted Train'), this.getAllTrains()]),
      (error: any) => {
        console.error('Error loading train data:', error)
      }
  }

  updateTrain(train: TrainData) {
    this.trainService.setSelectedTrain(train)
  }
}
