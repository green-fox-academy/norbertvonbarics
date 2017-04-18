package main.java.music;


public class Violin extends StringedInstrument {
  public Violin() {
    this.name = "Violin";
    this.numberOfStrings = 4;
    this.sound = "screeches";
  }

  public Violin(int stringNumber) {
    this.numberOfStrings = stringNumber;
    this.sound = "screeches";
  }
}
