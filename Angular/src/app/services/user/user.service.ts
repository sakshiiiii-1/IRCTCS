import { HttpClient } from '@angular/common/http'
import { Injectable } from '@angular/core'
import { Observable } from 'rxjs'
import { userLogin } from '../../classes/userLogin'
import { User } from '../../classes/user'

@Injectable({
  providedIn: 'root',
})
export class UserService {
  baseUrl = 'http://localhost:8181/users'
  constructor(private http: HttpClient) {}

  userAuthenticate(userData: userLogin): Observable<any> {
    return this.http.post<any>(`${this.baseUrl}/userAuthenticate`, userData)
  }

  userRegister(userData: User): Observable<any> {
    return this.http.post<any>(`${this.baseUrl}/addUsers`, userData)
  }
}
