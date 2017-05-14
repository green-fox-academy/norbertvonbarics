package com.greenfox.reddit.controller;

import com.greenfox.reddit.model.Post;
import com.greenfox.reddit.model.Posts;
import com.greenfox.reddit.services.PostRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class PostsController {

  @Autowired
  PostRepository postRepo;

  @Autowired
  Posts list;

  @RequestMapping(value = "/posts", method = RequestMethod.GET)
  public Object list(){
    list.setPosts((List<Post>)postRepo.findAll());

    return list;
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

  @RequestMapping(value = "/posts/{id}/downvote", method = RequestMethod.PUT)
  public Object downvote(@PathVariable(name = "id") long id){
    Post downvotePost = postRepo.findOne(id);
    downvotePost.downvote();
    postRepo.save(downvotePost);
    return downvotePost;
  }
}
