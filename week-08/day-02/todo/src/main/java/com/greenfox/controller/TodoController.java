package com.greenfox.controller;

import com.greenfox.model.Todo;
import com.greenfox.repository.TodoRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @Autowired
  TodoRepository todoRepo;

  @RequestMapping(value = {"/", "/list"})
  public String list(Model model, @RequestParam(name = "done", required = false) String done) {
    if (done != null) {
      Iterable<Todo> allTodos = todoRepo.findAll();
      List<Todo> undoneTodos = new ArrayList<>();
      for (Todo todo : allTodos) {
        if (!todo.isDone()) {
          undoneTodos.add(todo);
        }
      }
      model.addAttribute("todoRepo", undoneTodos);
    } else {
      model.addAttribute("todoRepo", todoRepo.findAll());
    }
    return "todolist";
  }

  @RequestMapping("/addTodo")
  public String addTodo(@RequestParam(name= "newTodo") String newTodo) {
    todoRepo.save(new Todo(newTodo));
    return "redirect:/todo/";
  }
}
