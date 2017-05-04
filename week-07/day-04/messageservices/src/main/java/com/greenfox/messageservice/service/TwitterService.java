package com.greenfox.messageservice.service;

public class TwitterService implements MessageService {

  @Override
  public String messageType() {
    return "Twit sent to ";
  }
}
