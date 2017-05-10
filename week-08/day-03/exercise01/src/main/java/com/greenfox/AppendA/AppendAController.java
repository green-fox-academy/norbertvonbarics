package com.greenfox.AppendA;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppendAController {

  @RequestMapping(value = "/appenda/{appendable}", method = RequestMethod.GET)
  public AddedA addA (@PathVariable("appendable") String text) {
   return new AddedA(text);
  }
}
