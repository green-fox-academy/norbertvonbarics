package com.greenfox.controller;

import com.greenfox.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Accounts {
  @RequestMapping("/Exercise1")
  public String accountController(Model model) {
    BankAccount simba = new BankAccount("simba", "2000", "lion");
    model.addAttribute("simba", simba);
    return "AccountTemplate1";
  }
}
