import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TicketUpdateService {

  constructor(private http: HttpClient) { }

  baseUrl = "http://localhost:8181/stations/";

  updateTickets(stationId:number, tclass:String, tAvail: number):Observable<any> {
    return this.http.put<any>(`${this.baseUrl}updateTickets/${stationId}/${tclass}/${tAvail}`,{})
  }
  


}
