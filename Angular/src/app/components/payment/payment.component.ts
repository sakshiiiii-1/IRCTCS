import { CommonModule } from '@angular/common'
import { Component, OnInit } from '@angular/core'
import { FormsModule } from '@angular/forms'
import { Payment } from '../../classes/Payment'
import { PaymentService } from '../../services/payment/payment.service'

@Component({
  selector: 'app-payment',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './payment.component.html',
  styleUrl: './payment.component.css',
})
export class PaymentComponent implements OnInit {
  paymentList: Payment[] = []

  payment = new Payment(0, 0, 0, '', 0)

  constructor(private paymentService: PaymentService) {}

  ngOnInit(): void {
    this.getPayments()
  }
  getPayments(): void {
    this.paymentService
      .getAllPayment()
      .subscribe((data) => [(this.paymentList = data), console.log(data)]),
      (error: any) => {
        console.error('Error loading train data:', error)
      }
  }
  addPayments() {
    this.paymentService
      .addPayment(this.payment)
      .subscribe(() => [
        alert('payment added'),
        this.getPayments(),
        (this.payment = new Payment(0, 0, 0, '', 0)),
      ]),
      (error: any) => {
        console.error('Error loading train data:', error)
      }
  }
}
