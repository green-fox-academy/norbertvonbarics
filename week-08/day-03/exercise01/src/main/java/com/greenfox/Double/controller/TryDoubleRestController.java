package com.greenfox.Double.controller;


import com.greenfox.Double.model.DoubledNumber;
import com.greenfox.ErrorMessage;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TryDoubleRestController {

  @RequestMapping(value = "/doubling", method = RequestMethod.GET)
  public DoubledNumber Doubling(@RequestParam(name = "input") int number){
    return new DoubledNumber(number);
  } @ExceptionHandler(Exception.class)
  public ErrorMessage parameterMissing (Exception e) {
    return new ErrorMessage("Please provide an input!");
  }
}
