package main.java.music;


public class StringedInstrument extends Instrument {
  @Override
  public void play() {
    System.out.printf(formatForPlay, name, numberOfStrings, sound);
  }
  int numberOfStrings;
  String sound;
}

//Electric Guitar, a 6-stringed instrument that twangs