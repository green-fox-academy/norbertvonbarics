package main.java.music;

abstract class Instrument {
  final String formatForPlay ="%s, a %d-stringed instrument that %s\n";
  protected String name;
  abstract void play();
}
