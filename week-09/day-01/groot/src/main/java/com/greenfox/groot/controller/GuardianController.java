package com.greenfox.groot.controller;

import com.greenfox.groot.ErrorMessage;
import com.greenfox.groot.model.Arrow;
import com.greenfox.groot.model.Groot;
import com.greenfox.groot.model.Rocket;
import com.greenfox.groot.model.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  @Autowired
  Rocket rocket;

  @RequestMapping(value = "/groot", method = RequestMethod.GET)
  public Object message(@RequestParam(name = "message") String message) {
    return new Groot(message);
  }

  @RequestMapping(value = "/yondu", method = RequestMethod.GET)
  public Object arrow(@RequestParam(name = "distance") double distance,
      @RequestParam(name = "time") double time) {
    if (time == 0) {
      return new ErrorMessage("Time can't be Zero!");
    } else {
      return new Arrow(distance, time);
    }
  }

  @RequestMapping(value = "/rocket", method = RequestMethod.GET)
  public Object rocket() {
    Rocket defaultRocket = new Rocket();
    return defaultRocket;
  }

  @RequestMapping(value = "/rocket/fill", method = RequestMethod.GET)
  public Status rocketFill(@RequestParam(name = "caliber") String type,
      @RequestParam(name = "amount") int amount) {
    Status status = new Status(type, amount);
    rocket.addCaliber(type, amount);
    status.setShipstatus(rocket.getShipstatus());
    status.setReady(rocket.isReady());
    return status;
  }


  @ResponseStatus(code = HttpStatus.I_AM_A_TEAPOT)
  @ExceptionHandler(Exception.class)
  public ErrorMessage parameterMissing(Exception e) {
    System.out.println(e.getMessage());
    return new ErrorMessage("I am Groot!");
  }
}
