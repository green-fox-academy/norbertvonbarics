package com.greenfox.reddit.controller;

import com.greenfox.reddit.model.Post;
import com.greenfox.reddit.services.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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

  @RequestMapping(value = "/posts/{id}/upvote", method = RequestMethod.PUT)
  public Object upvote(@PathVariable(name = "id") long id){
    Post upvotePost = postRepo.findOne(id);
    upvotePost.upvote();
    postRepo.save(upvotePost);
    return upvotePost;
  }

  @RequestMapping("/posts/{id}/downvote")
  public Object downvote(@PathVariable(name = "id") long id){
    Post downvotePost = postRepo.findOne(id);
    downvotePost.downvote();
    postRepo.save(downvotePost);
    return downvotePost;
  }
}
