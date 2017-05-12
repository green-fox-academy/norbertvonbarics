package com.greenfox.reddit.controller;

import com.greenfox.reddit.model.Post;
import com.greenfox.reddit.services.PostRepository;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedditController {

  @Autowired
  PostRepository postRepo;

  @RequestMapping(value = "/posts", method = RequestMethod.GET)
  public Object list(){
    return postRepo.findAll();
  }

  @RequestMapping(value = "/posts", method = RequestMethod.POST)
  public Object post(@RequestBody Post post){
    Post newPost = new Post(post.getTitle(), post.getHref());
    postRepo.save(newPost);
    return newPost;
  }

  @RequestMapping("/posts/{id}/upvote")
  public Object upvote(){
    return null;
  }

  @RequestMapping("/posts/{id}/downvote")
  public Object downvote(){
    return null;
  }

  @RequestMapping("/posts/{id}/")
  public Object singlePost(){
    return null;
  }
}
