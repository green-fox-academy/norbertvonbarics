package com.greenfox.Arrays;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.greenfox.DoUntil.Factor;
import com.greenfox.DoUntil.Sum;
import com.greenfox.ErrorMessage;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArrayController {
@RequestMapping(value= "/arrays", method= RequestMethod.POST)
  public Object arrayHandler (@RequestBody() Input input, HttpServletRequest request) {
  ObjectMapper mapper = new ObjectMapper();
  String body = null;
  try {
    body = mapper.writeValueAsString(input);
  } catch (JsonProcessingException e) {
    e.printStackTrace();
  }
    if (input.what.equals("sum")){
      return new SumArray(input.numbers);
    } else if (input.what.equals("multiply")){
      return new Multiply(input.numbers);
      } else if (input.what.equals("double")){
      return new Double(input.numbers);
    } else {return null;}
  }

  @ExceptionHandler(Exception.class)
  public ErrorMessage handleAllException(Exception e) {
    return new ErrorMessage("Please provide what to do with the numbers!");
  }
}
