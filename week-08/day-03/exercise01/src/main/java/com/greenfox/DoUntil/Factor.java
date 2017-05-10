package com.greenfox.DoUntil;


public class Factor {

  int result;

  public Factor(int number) {
    this.result = 1;
    for(int i = number; i > 0; i--) {
      result *= i;
    }
  }

  public int getResult() {
    return result;
  }

  public Factor() {
  }
}
