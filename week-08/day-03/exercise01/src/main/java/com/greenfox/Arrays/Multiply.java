package com.greenfox.Arrays;

public class Multiply {

  int result;

  public Multiply(int[] numbers) {
    result = 1;
    for (int i : numbers){
      result *= i;
    }
  }

  public int getResult() {
    return result;
  }
}
