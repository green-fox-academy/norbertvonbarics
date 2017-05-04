package com.greenfox.messageservice.service;

public class EmailService implements MessageService {
  @Override
  public String messageType() {
    return "Email sent to ";
  }
}
