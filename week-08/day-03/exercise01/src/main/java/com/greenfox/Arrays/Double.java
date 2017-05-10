package com.greenfox.Arrays;

public class Double {

  int[] result;

  public Double(int[] numbers){
    result = new int[numbers.length];
    for(int i = 0; i < numbers.length; i++){
     result[i] = numbers[i] * 2;
    }
  }

  public int[] getResult() {
    return result;
  }
}
