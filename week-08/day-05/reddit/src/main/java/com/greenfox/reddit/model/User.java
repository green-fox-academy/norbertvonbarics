package com.greenfox.reddit.model;

public class User {
  String owner;

  public User(String owner) {
    this.owner = owner;
  }

  public User() {
  }

  public String getOwner() {
    return owner;
  }
}
