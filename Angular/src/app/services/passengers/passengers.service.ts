import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Passenger } from '../../classes/passengers';

@Injectable({
  providedIn: 'root'
})
export class PassengersService {

  baseUrl = "http://localhost:8181/passengers";
  constructor(private http: HttpClient) { }

  addPassengers(passengerDetails : Passenger[]): Observable<any>{
    return this.http.post<any>(`${this.baseUrl}/addPassengers`, passengerDetails);
  }

}
