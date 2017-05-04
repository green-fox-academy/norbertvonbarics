package com.greenfox;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Tamagochi {
  @RequestMapping("/tamagochi")
  public String tamagochiControl (Model model) {
    System.out.println("mukodj");
    return "tamagochi";
  }
}
