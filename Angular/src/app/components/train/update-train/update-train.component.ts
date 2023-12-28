import { Component, OnInit } from '@angular/core'

import { TrainData } from '../../../classes/train-data'
import { TrainService } from '../../../services/train/train.service'
import { CommonModule } from '@angular/common'
import { FormsModule } from '@angular/forms'

import { Router } from '@angular/router'

@Component({
  selector: 'app-update-train',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './update-train.component.html',
  styleUrl: './update-train.component.css',
})
export class UpdateTrainComponent implements OnInit {
  trainToUpdate: TrainData = { trainId: 0, trainName: '', trainNumber: 0 }

  constructor(private trainService: TrainService, private router: Router) {}

  ngOnInit(): void {
    this.trainService.selectedTrain$.subscribe((selectedTrain) => {
      if (selectedTrain) {
        this.trainToUpdate = { ...selectedTrain } // Copy the selected train to avoid reference issues
      }
    })
  }

  updateTrain() {
    this.trainService.updateTrain(this.trainToUpdate).subscribe(() => {[ this.GotoTrainCompo()]
      // Handle success, e.g., show a success message
    })
  }

  GotoTrainCompo() {
    this.router.navigate(['/trainOperation'])
  }
}
