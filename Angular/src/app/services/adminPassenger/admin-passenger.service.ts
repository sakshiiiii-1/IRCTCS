import { HttpClient } from '@angular/common/http'
import { Injectable } from '@angular/core'
import { Observable } from 'rxjs'

@Injectable({
  providedIn: 'root',
})
export class AdminPassengerService {
  baseUrl = 'http://localhost:8181'

  constructor(private http: HttpClient) {}

  getAllPassengers(): Observable<any> {
    return this.http.get<any>(`${this.baseUrl}/passengers/getPassengers`)
  }

  deletePassengers(passengerId: any): Observable<any> {
    return this.http.delete<any>(`${this.baseUrl}/passengers/${passengerId}`)
  }
}
