package com.greenfox;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class ColorConfig {

  @Bean
  public MyColor red() {
    return new RedColor();
  }
  @Bean
  public MyColor blue(){
    return new BlueColor();
  }
}