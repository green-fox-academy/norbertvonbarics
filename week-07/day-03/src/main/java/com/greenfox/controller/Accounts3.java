package com.greenfox.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Accounts3 {
  @RequestMapping("/Exercise10")
  public String accountController(Model model) {
    List<BankAccount> accounts = new ArrayList<>();
    BankAccount animal1 = new BankAccount("simba", 2000, "lion");
    BankAccount.setKing(animal1);
    BankAccount.setBad(animal1);
    BankAccount animal2 = new BankAccount("zebra", 4000, "zebra");
    BankAccount animal3 = new BankAccount("birka", 3000, "sheep");
    BankAccount animal4 = new BankAccount("floki", 5000, "dog");
    accounts.add(animal1);
    accounts.add(animal2);
    accounts.add(animal3);
    accounts.add(animal4);

    model.addAttribute("accounts", accounts);
    return "AccountTemplate3";
  }

  @RequestMapping(value = "/processForm", method = RequestMethod.POST)
  public String processForm(@ModelAttribute(value = "index") Integer index) {
    return "Exercise5";
  }
}
