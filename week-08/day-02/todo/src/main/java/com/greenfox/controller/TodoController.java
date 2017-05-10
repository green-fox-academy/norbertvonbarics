package com.greenfox.controller;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

import com.greenfox.model.Todo;
import com.greenfox.repository.TodoRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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
  public String addTodo(@RequestParam(name = "newTodo") String newTodo) {
    todoRepo.save(new Todo(newTodo));
    return "redirect:/todo/";
  }

  @RequestMapping("/deleteTodo")
  public String deleteTodo(@RequestParam(name = "delete") long id) {
    todoRepo.delete(id);
    return "redirect:/todo/";
  }

  @RequestMapping("/edit")
  public String edit(Model model, @RequestParam(name = "edit") long id) {
    model.addAttribute("todo", getTodo(id));
    return "edit";
  }

  @RequestMapping("/{id}/change")
  public String editTodo(@PathVariable(name = "id") long id,
      @RequestParam(name = "title") String title,
      @RequestParam(name = "urgent", required = false) String urgent,
      @RequestParam(name = "done", required = false) String done) {
    Todo todo = todoRepo.findOne(id);
    todo.setTitle(title);
    todo.setDone(done != null);
    todo.setUrgent(urgent != null);
    todoRepo.save(todo);
    return "redirect:/todo/";
  }

  Todo getTodo(long id) {
    Iterable<Todo> list = todoRepo.findAll();
    Todo aTodo = new Todo();
    for (Todo todo : list) {
      if (todo.getId() == id) {
        aTodo = todo;
      }
    }
    return aTodo;
  }
}
