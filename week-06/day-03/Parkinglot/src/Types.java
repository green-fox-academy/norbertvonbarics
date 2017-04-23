public enum Types {
  FERRARI, BMW, WOLKSVAGEN, TRABANT, OPEL, FORD, MARUTI, MINICOOPER, SMART, KIA, SEAT;

  static Types randomType() {
    int randomNumber = (int) (Math.random() * 11);
    return values()[randomNumber];
  }
}

