import { Station } from "./Station";
import { TrainData } from "./train-data";

export class StationTrainResponse {
  stations: Station[];
  trains: TrainData[];

  constructor(stations: Station[], trains: TrainData[]) {
    this.stations = stations;
    this.trains = trains;
  }
}