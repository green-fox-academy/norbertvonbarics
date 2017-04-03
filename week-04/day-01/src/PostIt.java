import java.awt.*;

public class PostIt {
  private Color backgroundColor;
  private String text;
  private Color textColor;

  public PostIt() {
    this(null, "nah", null);
  }

  public PostIt(Color backgroundColor, String text, Color textColor) {
    this.backgroundColor = backgroundColor;
    this.text = text;
    this.textColor = textColor;
  }

  public static void main(String[] args) {
    PostIt post1 = new PostIt();
    PostIt post2 = new PostIt(Color.pink, "Awesome!", Color.black);
    PostIt post3 = new PostIt(Color.yellow, "Superb!", Color.green);
    post1.backgroundColor = Color.orange;
    post1.text = "Idea'";
    post1.textColor = Color.blue;
    printPostIt(post1);
    printPostIt(post2);
    printPostIt(post3);
  }

  public static void printPostIt (PostIt posts) {
    System.out.println(posts.backgroundColor + posts.text + posts.textColor);
  }
}

