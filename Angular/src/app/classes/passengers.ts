export class Passenger {
  passengerId!: number
  passengerName: string
  passengerAge: number
  passengerContact: number
  passengerCountry: string
  passengerPrefer: string

  constructor(
    passengerId: number,
    passengerName: string,
    passengerAge: number,
    passengerContact: number,
    passengerCountry: string,
    passengerPrefer: string,
  ) {
    this.passengerId = passengerId
    this.passengerName = passengerName
    this.passengerAge = passengerAge
    this.passengerContact = passengerContact
    this.passengerCountry = passengerCountry
    this.passengerPrefer = passengerPrefer
  }
}
