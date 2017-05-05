package com.greenfox.controller;

import com.greenfox.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
  @Autowired
  private Fox mrGreen;

  @RequestMapping("/tamagotchi")
  public String tamagotchiControl(Model model) {
    mrGreen.setName("Floki");
    mrGreen.setDrink("water");
    mrGreen.setFood("snack");
    model.addAttribute("tricks", mrGreen.getTricks());
    model.addAttribute("name", mrGreen.getName());
    model.addAttribute("food", mrGreen.getFood());
    model.addAttribute("drink", mrGreen.getDrink());
    model.addAttribute("trickSize", mrGreen.getTricks().size());
    model.addAttribute("tricks", mrGreen.getTricks());
    return "index";
  }

  @RequestMapping("/nutritionStore")
  public String nutritionStore(Model model) {

    return "nutritionStore";
  }
}