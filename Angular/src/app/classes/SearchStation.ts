export class SearchStation {
  stationFrom: string
  stationTo: string
  date:Date

  constructor(stationFrom: string, stationTo: string, date : Date = new Date()) {
    this.stationFrom = stationFrom
    this.stationTo = stationTo
    this.date=date
  }
}
