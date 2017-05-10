package com.greenfox.DoUntil;

import com.greenfox.ErrorMessage;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoUntilController {


  @RequestMapping(value = "/dountil/{what}", method = RequestMethod.POST)
  public Object doUntil (@PathVariable (name = "what") String what, @RequestBody() DoUntil until){
    System.out.println(until.getUntil());
    if (what.equals("sum")){
      return new Sum(until.getUntil());
    } else if (what.equals("factor")){
      return new Factor(until.getUntil());
    } else {return null;}
  }

  @ExceptionHandler(Exception.class)
  public ErrorMessage handleAllException(Exception e) {
    return new ErrorMessage("Please provide a number!");
  }
}
