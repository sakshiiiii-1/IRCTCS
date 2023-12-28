import { HttpClient } from '@angular/common/http'
import { Injectable } from '@angular/core'
import { Observable } from 'rxjs'
import { Payment } from '../../classes/Payment'

@Injectable({
  providedIn: 'root',
})
export class PaymentService {
  baseUrl = 'http://localhost:8181'

  constructor(private http: HttpClient) {}

  getAllPayment(): Observable<any> {
    return this.http.get<any>(`${this.baseUrl}/payment/getPayments`)
  }

  addPayment(payment: Payment): Observable<any> {
    return this.http.post<any>(`${this.baseUrl}/payment/addPayments`, payment)
  }
}
