package com.greenfox.Double.model;

public class DoubledNumber {
  int received;
  int result;

  public DoubledNumber() {
  }

  public DoubledNumber(int received) {
    this.received = received;
    result = received *2;
  }

  public int getReceived() {
    return received;
  }

  public int getResult() {
    return result;
  }
}
