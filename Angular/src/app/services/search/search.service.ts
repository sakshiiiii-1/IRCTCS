import { HttpClient } from '@angular/common/http'
import { Injectable } from '@angular/core'
import { Observable } from 'rxjs'
import { SearchStation } from '../../classes/SearchStation'

@Injectable({
  providedIn: 'root',
})
export class SearchService {
  baseUrl = 'http://localhost:8181/stations'

  constructor(private http: HttpClient) {}

  searchTrains(stationInfo: SearchStation): Observable<any> {
    return this.http.post<any>(`${this.baseUrl}/findTrains`, stationInfo)
  }
}
