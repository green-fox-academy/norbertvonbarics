package com.greenfox.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BankAccount {
  String name;
  String balance;
  String animalType;
  boolean king;
  boolean good;

  public BankAccount(String name, String balance, String animalType) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.king = false;
    this.good = true;
  }

  public static void setKing(BankAccount animal) {
    animal.king = true;
  }

  public static void setBad(BankAccount animal) {
    animal.good = false;
  }
}


