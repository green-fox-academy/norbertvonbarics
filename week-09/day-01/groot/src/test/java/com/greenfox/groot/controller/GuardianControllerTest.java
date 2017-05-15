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
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


import static org.hamcrest.CoreMatchers.is;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

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

  @Test
  public void testRocket() throws Exception {
    mockMvc.perform(get("/rocket"))
        .andExpect(status().isOk())
        .andExpect(content().contentType(contentType))
        .andExpect(content()
            .json(
                "{\"caliber25\": 0, \"caliber30\": 0, \"caliber50\": 0, \"shipstatus\": \"empty\", \"ready\": false}",
                true));
  }

  @Test
  public void testFillWithOverload() throws Exception {
    mockMvc.perform(get("/rocket/fill?caliber=.50&amount=50000"))
        .andExpect(status().isOk())
        .andExpect(content().contentType(contentType))
        .andExpect(jsonPath("$.received", is(".50")))
        .andExpect(jsonPath("$.amount", is(50000)))
        .andExpect(jsonPath("$.shipstatus", is("full")))
        .andExpect(jsonPath("$.ready", is(true)));
  }

  @Test
  public void testFillWithFull() throws Exception {
    mockMvc.perform(get("/rocket/fill?caliber=.30&amount=12500"))
        .andExpect(status().isOk())
        .andExpect(content().contentType(contentType))
        .andExpect(jsonPath("$.received", is(".30")))
        .andExpect(jsonPath("$.amount", is(12500)))
        .andExpect(jsonPath("$.shipstatus", is("full")))
        .andExpect(jsonPath("$.ready", is(true)));
  }


  @Test
  public void testRocketWithoutParameter() throws Exception {
    mockMvc.perform(get("/rocket/fill"))
        .andExpect(status().isIAmATeapot())
        .andExpect(content()
            .json("{\"error\": \"I am Groot!\"}", true));
  }
}