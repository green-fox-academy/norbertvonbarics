package com.greenfox.reddit.model;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Post {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;
  String title;
  String href;
  Timestamp timestamp;
  int score = 0;

  public Post() {
  }

  public Post(String title, String href, int score) {
    this.title = title;
    this.href = href;
    this.timestamp = new Timestamp(System.currentTimeMillis());
    this.score = score;
  }

  public Post(String title, String href) {
    this.title = title;
    this.href = href;
    this.timestamp = new Timestamp(System.currentTimeMillis());
  }

  public void upvote() {
    score++;
  }

  public void downvote() {
    score--;
  }

  @Override
  public String toString() {
    return "Post{" +
        "id=" + id +
        ", title='" + title + '\'' +
        ", href='" + href + '\'' +
        ", timestamp=" + timestamp +
        ", score=" + score +
        '}';
  }
}
