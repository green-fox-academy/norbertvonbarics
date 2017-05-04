package com.greenfox.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Accounts2 {
  @RequestMapping("/Exercise5")
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
    return "AccountTemplate2";
  }
}
