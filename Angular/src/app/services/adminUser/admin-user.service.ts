import { HttpClient } from '@angular/common/http'
import { Injectable } from '@angular/core'
import { Observable } from 'rxjs'

@Injectable({
  providedIn: 'root',
})
export class AdminUserService {
  baseUrl = 'http://localhost:8181'
  constructor(private http: HttpClient) {}

  getUser(): Observable<any> {
    return this.http.get<any>(`${this.baseUrl}/users/getUsers`)
  }
  deleteUser(userId: any): Observable<any> {
    return this.http.get<any>(`${this.baseUrl}/users/getUsers/${userId}`)
  }
}
