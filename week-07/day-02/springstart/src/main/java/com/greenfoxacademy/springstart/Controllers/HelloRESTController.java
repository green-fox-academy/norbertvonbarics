package com.greenfoxacademy.springstart.Controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {
  AtomicLong atomicLong = new AtomicLong();
  @RequestMapping("/greeting")
  public Greeting greeting(@RequestParam("name") String username) {

    return new Greeting(atomicLong.getAndIncrement(), username);
  }
}
