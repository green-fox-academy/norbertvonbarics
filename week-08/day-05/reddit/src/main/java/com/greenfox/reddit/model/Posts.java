package com.greenfox.reddit.model;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class Posts {

  List<Post> posts = new ArrayList<>();

  public Posts() {
  }

  public Posts(List<Post> posts) {
    this.posts = posts;
  }

  public List<Post> getPosts() {
    return posts;
  }

  public void setPosts(List<Post> posts) {
    this.posts = posts;
  }
}
