package com.greenfox.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Enjoy {
  @RequestMapping("/Exercise4")
  public String accountController(Model model) {
    model.addAttribute("enjoy", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "EnjoyTemplate";
  }
}