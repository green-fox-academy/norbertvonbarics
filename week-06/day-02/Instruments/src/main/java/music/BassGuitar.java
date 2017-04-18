package main.java.music;


public class BassGuitar extends StringedInstrument {
  public BassGuitar() {
    this.name = "Bass Guitar";
    this.numberOfStrings = 4;
    this.sound = "Duum-duum-duum";
  }

  public BassGuitar(int stringNumber) {
    this.numberOfStrings = stringNumber;
    this.sound = "Duum-duum-duum";
  }
}
