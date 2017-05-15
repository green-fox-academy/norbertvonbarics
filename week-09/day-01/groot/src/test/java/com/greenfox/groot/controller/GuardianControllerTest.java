package com.greenfox.groot.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;


import com.greenfox.groot.GrootApplication;
import java.nio.charset.Charset;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = GrootApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class GuardianControllerTest {

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
      MediaType.APPLICATION_JSON.getSubtype(),
      Charset.forName("utf8"));

  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }


  @Test
  public void testParameterIsOK() throws Exception {
    mockMvc.perform(get("/groot?message=message"))
        .andExpect(status().isOk())
        .andExpect(content().contentType(contentType))
        .andExpect(content()
            .json("{\"received\": \"message\", \"translated\": \"I am Groot!\"}", true));
  }

  @Test
  public void testYondu() throws Exception {
    mockMvc.perform(get("/yondu?distance=100.0&time=10.0"))
        .andExpect(status().isOk())
        .andExpect(content().contentType(contentType))
        .andExpect(content()
            .json("{\"distance\": 100.0, \"time\": 10.0, \"speed\": 10.0}", true));
  }

  @Test
  public void testYonduZeroTime() throws Exception {
    mockMvc.perform(get("/yondu?distance=100.0&time=0"))
        .andExpect(status().isOk())
        .andExpect(content()
            .json("{\"error\": \"Time can't be Zero!\"}", true));
  }

  @Test
  public void testWithoutParameter() throws Exception {
    mockMvc.perform(get("/groot"))
        .andExpect(status().isIAmATeapot())
        .andExpect(content()
            .json("{\"error\": \"I am Groot!\"}", true));
  }

  @Test
  public void testYonduWithoutParameter() throws Exception {
    mockMvc.perform(get("/yondu"))
        .andExpect(status().isIAmATeapot())
        .andExpect(content()
            .json("{\"error\": \"I am Groot!\"}", true));
  }
}