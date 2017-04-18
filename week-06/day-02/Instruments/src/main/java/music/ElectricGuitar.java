package main.java.music;


public class ElectricGuitar extends StringedInstrument {
  public ElectricGuitar() {
    this.name = "Electric Guitar";
    this.numberOfStrings = 6;
    this.sound = "twangs";
  }
  public ElectricGuitar(int stringNumber) {
    this.numberOfStrings = stringNumber;
    this.sound = "twangs";
  }
}
