package com.greenfox.Arrays;

public class SumArray {
  int result;

  public SumArray(int[] numbers){
    result = 0;
    for (int i : numbers){
      result += i;
    }
  }

  public int getResult() {
    return result;
  }
}
