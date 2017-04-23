public enum Colors {
  RED, BLUE, GREEN, WHITE, BLACK, YELLOW, PURPLE, PINK, GREY, BROWN, ORANGE;

  static Colors randomColors() {
    int randomNumber = (int) (Math.random() * 11);
    return values()[randomNumber];
  }
}

