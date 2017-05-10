package com.greenfox.Greet;

public class Greet {

  String welcome_message;

  public Greet(String name, String title) {
    this.welcome_message = "Oh, hi there " + name + ", my dear " + title + "!";
  }

  public String getWelcome_message() {
    return welcome_message;
  }
}
