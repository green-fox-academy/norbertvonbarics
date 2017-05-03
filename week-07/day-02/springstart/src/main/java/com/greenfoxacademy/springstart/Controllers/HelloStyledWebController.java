package com.greenfoxacademy.springstart.Controllers;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloStyledWebController {

  AtomicLong atomicLong = new AtomicLong();

  String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj",
      "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
      "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló",
      "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
      "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry",
      "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
      "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem",
      "Sawubona"};

  String[] colors = {"yellow", "red", "orange", "blue"};


  @RequestMapping("/web/greetingstyled")
  public String greeting(Model model, @RequestParam("name") String username){
    int randomNumber = (int) (Math.random()*30);
    model.addAttribute("styledText", hellos);
    model.addAttribute("name", username);
    model.addAttribute("id", atomicLong.getAndIncrement());
    model.addAttribute("length", colors.length);
    model.addAttribute("color", colors);
    model.addAttribute("randomNumber", randomNumber);
    return "greetingstyled";
  }
}

