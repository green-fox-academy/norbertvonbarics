package com.greenfoxacademy.springstart.Controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWebController {

  AtomicLong atomicLong = new AtomicLong();

  @RequestMapping("/web/greeting")
  public String greeting(Model model, @RequestParam("name") String username) {
    model.addAttribute("name", username);
    model.addAttribute("id", atomicLong.getAndIncrement());
    return "greeting";
  }
}
