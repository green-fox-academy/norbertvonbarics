package com.greenfox.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;
  String title;
  boolean urgent = false;
  boolean done = false;

  public Todo() {
  }

  public Todo(String title, boolean Urgent, boolean Done) {
    this.title = title;
    this.urgent = Urgent;
    this.done = Done;
  }

  public Todo(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "Todo{" +
        "id=" + id +
        ", title='" + title + '\'' +
        ", Urgent=" + urgent +
        ", Done=" + done +
        '}';
  }
}
