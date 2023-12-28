import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, catchError, throwError } from 'rxjs';
import { Admin } from '../../classes/Admin';

@Injectable({
  providedIn: 'root'
})
export class AdminLoginService {


  constructor(private http: HttpClient) { }

  baseUrl = "http://localhost:8181/admin";

  authenAdmin(adminDetails: Admin): Observable<any> {
    return this.http.post<any>(`${this.baseUrl}/authenticate`, adminDetails)
      .pipe(
        catchError((error: any) => {
          console.error('Error authenticating admin:', error);
          return throwError(error); // Rethrow the error
        })
      );
  }
 
}
