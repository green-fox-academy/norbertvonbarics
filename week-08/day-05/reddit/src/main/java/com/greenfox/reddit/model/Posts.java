package com.greenfox.reddit.model;

import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class Posts {
  List<Post> posts;

  public Posts() {
  }

  public Posts(List<Post> posts) {
    this.posts = posts;
  }
}
