package com.greenfox.model;

public class Todo {

  int id;
  String title;
  boolean isUrgent = false;
  boolean isDone = false;

  public Todo() {}

  public Todo(int id, String title, boolean isUrgent, boolean isDone) {
    this.id = id;
    this.title = title;
    this.isUrgent = isUrgent;
    this.isDone = isDone;
  }
}
