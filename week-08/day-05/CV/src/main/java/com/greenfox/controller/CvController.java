package com.greenfox.controller;

import com.greenfox.model.Work;
import com.greenfox.repository.CVRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class CvController {

  @Autowired
  CVRepository cvRepo;

  @RequestMapping("/")
  public String list(Model model) {
    model.addAttribute("workList", cvRepo.findAll());
    return "index";
  }

  @RequestMapping("/addWork")
  public String addWork(@RequestParam(name = "addWork") String addWork) {
    cvRepo.save(new Work(addWork));
    return "redirect:/";
  }

  @RequestMapping("/deleteWork")
  public String deleteWork(@RequestParam(name = "delete") long id) {
    cvRepo.delete(id);
    return "redirect:/";
  }
}
