package com.greenfox.Greet;


import com.greenfox.ErrorMessage;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

  @RequestMapping(value = "/greeter", method = RequestMethod.GET)
  public Greet greeter(@RequestParam(name = "name") String name,
      @RequestParam(name = "title") String title) {
    return new Greet(name, title);
  }

  @ExceptionHandler(Exception.class)
  public ErrorMessage parameterMissing(Exception e) {
    if (e.getMessage().contains("name")) {
      return new ErrorMessage("Please provide a name!");
    } else if (e.getMessage().contains("title")) {
      return new ErrorMessage("Please provide a title!");
    } else {return null;}
  }
}
