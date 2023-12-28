export class Payment {
  cardNumber: number
  date: number
  cvv: number
  NameonCard: String
  Amount: number

  constructor(
    cardNumber: number,
    date: number,
    cvv: number,
    nameOnCard: string,
    amount: number,
  ) {
    this.cardNumber = cardNumber
    this.date = date
    this.cvv = cvv
    this.NameonCard = nameOnCard
    this.Amount = amount
  }

  // Getter methods
  getCardNumber(): number {
    return this.cardNumber
  }

  getDate(): number {
    return this.date
  }

  getCvv(): number {
    return this.cvv
  }

  getAmount(): number {
    return this.Amount
  }

  // Setter methods
  setCardNumber(cardNumber: number): void {
    this.cardNumber = cardNumber
  }

  setDate(date: number): void {
    this.date = date
  }

  setCvv(cvv: number): void {
    this.cvv = cvv
  }

  setNameonCard(nameOnCard: string): void {
    this.NameonCard = nameOnCard
  }

  setAmount(amount: number): void {
    this.Amount = amount
  }
}
