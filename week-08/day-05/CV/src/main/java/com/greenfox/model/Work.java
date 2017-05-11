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
public class Work {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;
  String workplace;

  public Work(){}

  public Work(String workplace) {
    this.workplace = workplace;
  }

  @Override
  public String toString() {
    return "Work{" +
        "id=" + id +
        ", workplace='" + workplace + '\'' +
        '}';
  }
}
