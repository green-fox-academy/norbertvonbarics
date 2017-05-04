package com.greenfox.messageservice;

import com.greenfox.messageservice.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageProceeder {

  @Autowired
  MessageService service;

  public void processMessage(String message, String adress) {
    System.out.println(service.messageType() + adress + " with message=  " + message);
  }
}
