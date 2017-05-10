package com.greenfox.DoUntil;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Sum {

  int result;

  public Sum(int number) {
    this.result = 0;
    for(int i = number; i > 0; i--) {
      result += i;
    }
  }


  public Sum() {
  }

  public int getResult() {
    return result;


  }
}
