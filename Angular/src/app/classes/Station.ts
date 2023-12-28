export class Station {
  stationId:number;
  stationFrom: string;
  stationTo: string;
  arrivalTime: string;
  reachTime: string;
  totalTime: string;
  sleeperTicketsAvailable: number;
  sleeperTicketPrice: number;
  secondAcTicketsAvailable: number;
  secondAcTicketPrice: number;
  thirdAcTicketsAvailable: number;
  thirdAcTicketPrice: number;
  firstAcTicketsAvailable: number;
  firstAcTicketPrice: number;
  date:Date;
  constructor(
    stationId:number,
    stationFrom: string,
    stationTo: string,
    arrivalTime: string,
    reachTime: string,
    totalTime: string,
    sleeperTicketsAvailable: number,
    sleeperTicketPrice: number,
    secondAcTicketsAvailable: number,
    secondAcTicketPrice: number,
    thirdAcTicketsAvailable: number,
    thirdAcTicketPrice: number,
    firstAcTicketsAvailable: number,
    firstAcTicketPrice: number,
    date:Date,
  ) {
    this.stationId = stationId;
    this.stationFrom = stationFrom;
    this.stationTo = stationTo;
    this.arrivalTime = arrivalTime;
    this.reachTime = reachTime;
    this.totalTime = totalTime;
    this.sleeperTicketsAvailable = sleeperTicketsAvailable;
    this.sleeperTicketPrice = sleeperTicketPrice;
    this.secondAcTicketsAvailable = secondAcTicketsAvailable;
    this.secondAcTicketPrice = secondAcTicketPrice;
    this.thirdAcTicketsAvailable = thirdAcTicketsAvailable;
    this.thirdAcTicketPrice = thirdAcTicketPrice;
    this.firstAcTicketsAvailable = firstAcTicketsAvailable;
    this.firstAcTicketPrice = firstAcTicketPrice;
    this.date=date;
  }

  // Getter and setter methods for each property
  getStationId(): number {
    return this.stationId;
  }

  setStationId(stationId: number): void {
    this.stationId = stationId;
  }

  getStationFrom(): string {
    return this.stationFrom;
  }

  setStationFrom(stationFrom: string): void {
    this.stationFrom = stationFrom;
  }

  getStationTo(): string {
    return this.stationTo;
  }

  setStationTo(stationTo: string): void {
    this.stationTo = stationTo;
  }

  getArrivalTime(): string {
    return this.arrivalTime;
  }

  setArrivalTime(arrivalTime: string): void {
    this.arrivalTime = arrivalTime;
  }

  getReachTime(): string {
    return this.reachTime;
  }

  setReachTime(reachTime: string): void {
    this.reachTime = reachTime;
  }

  getTotalTime(): string {
    return this.totalTime;
  }

  setTotalTime(totalTime: string): void {
    this.totalTime = totalTime;
  }

  getSleeperTicketsAvailable(): number {
    return this.sleeperTicketsAvailable;
  }

  setSleeperTicketsAvailable(sleeperTicketsAvailable: number): void {
    this.sleeperTicketsAvailable = sleeperTicketsAvailable;
  }

  getSleeperTicketPrice(): number {
    return this.sleeperTicketPrice;
  }

  setSleeperTicketPrice(sleeperTicketPrice: number): void {
    this.sleeperTicketPrice = sleeperTicketPrice;
  }

  getSecondAcTicketsAvailable(): number {
    return this.secondAcTicketsAvailable;
  }

  setSecondAcTicketsAvailable(secondAcTicketsAvailable: number): void {
    this.secondAcTicketsAvailable = secondAcTicketsAvailable;
  }

  getSecondAcTicketPrice(): number {
    return this.secondAcTicketPrice;
  }

  setSecondAcTicketPrice(secondAcTicketPrice: number): void {
    this.secondAcTicketPrice = secondAcTicketPrice;
  }

  getThirdAcTicketsAvailable(): number {
    return this.thirdAcTicketsAvailable;
  }

  setThirdAcTicketsAvailable(thirdAcTicketsAvailable: number): void {
    this.thirdAcTicketsAvailable = thirdAcTicketsAvailable;
  }

  getThirdAcTicketPrice(): number {
    return this.thirdAcTicketPrice;
  }

  setThirdAcTicketPrice(thirdAcTicketPrice: number): void {
    this.thirdAcTicketPrice = thirdAcTicketPrice;
  }

  getFirstAcTicketsAvailable(): number {
    return this.firstAcTicketsAvailable;
  }

  setFirstAcTicketsAvailable(firstAcTicketsAvailable: number): void {
    this.firstAcTicketsAvailable = firstAcTicketsAvailable;
  }

  getFirstAcTicketPrice(): number {
    return this.firstAcTicketPrice;
  }

  setFirstAcTicketPrice(firstAcTicketPrice: number): void {
    this.firstAcTicketPrice = firstAcTicketPrice;
  }
}
