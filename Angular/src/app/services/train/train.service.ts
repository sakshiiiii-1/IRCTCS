import { HttpClient } from '@angular/common/http'
import { Injectable } from '@angular/core'
import { BehaviorSubject, Observable } from 'rxjs'
import { TrainData } from '../../classes/train-data'

@Injectable({
  providedIn: 'root',
})
export class TrainService {
  private selectedTrainSubject = new BehaviorSubject<TrainData | null>(null)
  selectedTrain$: Observable<TrainData | null> = this.selectedTrainSubject.asObservable()

  baseUrl = 'http://localhost:8181'

  constructor(private http: HttpClient) {}

  getAllTrains(): Observable<any> {
    return this.http.get<any>(`${this.baseUrl}/trains/getTrains`)
  }

  addTrains(trainData: TrainData): Observable<any> {
    return this.http.post<any>(`${this.baseUrl}/trains/addTrains`, trainData)
  }

  deleteTrain(trainId: any): Observable<any> {
    return this.http.delete<any>(`${this.baseUrl}/trains/${trainId}`)
  }

  updateTrain(UpdateTrain: TrainData): Observable<any> {
    return this.http.put<any>(`${this.baseUrl}/trains/updateTrain`, UpdateTrain)
  }

  setSelectedTrain(train: TrainData | null): void {
    this.selectedTrainSubject.next(train)
  }
}
