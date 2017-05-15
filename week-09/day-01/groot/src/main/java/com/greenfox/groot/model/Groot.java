package com.greenfox.groot.model;


public class Groot {
  String received;
  String translated;

  public Groot() {
  }

  public Groot(String received) {
    this.received = received;
    this.translated = "I am Groot!";
  }

  public String getReceived() {
    return received;
  }

  public String getTranslated() {
    return translated;
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public void setTranslated(String translated) {
    this.translated = translated;
  }
}
