package com.greenfox.groot.model;


import org.springframework.stereotype.Component;

public class Status {
   String received;
   int amount;
   String shipstatus;
   boolean ready;

  public Status(String received, int amount) {
    this.received = received;
    this.amount = amount;
  }

  public Status() {
  }

  public String getReceived() {
    return received;
  }

  public int getAmount() {
    return amount;
  }

  public String getShipstatus() {
    return shipstatus;
  }

  public boolean isReady() {
    return ready;
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public void setShipstatus(String shipstatus) {
    this.shipstatus = shipstatus;
  }

  public void setReady(boolean ready) {
    this.ready = ready;
  }

  @Override
  public String toString() {
    return "Status{" +
        "received='" + received + '\'' +
        ", amount=" + amount +
        ", shipstatus='" + shipstatus + '\'' +
        ", ready=" + ready +
        '}';
  }
}
