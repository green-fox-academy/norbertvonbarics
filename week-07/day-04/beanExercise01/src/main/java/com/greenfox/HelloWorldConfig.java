package com.greenfox;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldConfig {
  @Bean
  public HelloWorld HelloWorldConfig() {
    return new HelloWorld();
  }

}
