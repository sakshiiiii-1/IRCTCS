import { HttpClient } from '@angular/common/http'
import { Injectable } from '@angular/core'
import { Observable } from 'rxjs'
import { Station } from '../../classes/Station'

@Injectable({
  providedIn: 'root',
})
export class AdminStationService {
  baseUrl = 'http://localhost:8181'
  constructor(private http: HttpClient) {}

  getAllStations(): Observable<any> {
    return this.http.get<any>(`${this.baseUrl}/stations/getStations`)
  }

  addStations(stationData: Station): Observable<any> {
    return this.http.post<any>(
      `${this.baseUrl}/stations/addStations`,
      stationData,
    )
  }
  deleteStations(stationId: any): Observable<any> {
    return this.http.delete<any>(
      `${this.baseUrl}/stations/deleteStations/${stationId}`,
    )
  }
}
