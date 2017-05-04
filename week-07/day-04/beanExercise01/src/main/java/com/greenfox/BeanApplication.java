package com.greenfox;

import javafx.scene.effect.BlurType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BeanApplication implements CommandLineRunner {

  @Autowired
  HelloWorld hello;

  @Autowired
  @Qualifier("red")
  MyColor red;

  @Autowired
  @Qualifier("blue")
  MyColor blue;


  public static void main(String[] args) {
    SpringApplication.run(BeanApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    hello.setMessage("Hello World");
    System.out.println(hello.getMessage());
    red.printColor();
    blue.printColor();
  }
}
