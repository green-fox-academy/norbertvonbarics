import java.util.Date;

public class BlogPost {
  private String author;
  private String title;
  private String text;
  private String publicationDate;

  public BlogPost() {
    this("jane doe", "no way", "not", "2000.01.01");
  }

  public BlogPost(String author, String title, String text, String publicationDate) {
    this.author = author;
    this.title = title;
    this.text = text;
    this.publicationDate = publicationDate;
  }

  public static void main(String[] args) {
    BlogPost post1 = new BlogPost();
    BlogPost post2 = new BlogPost();
    BlogPost post3 = new BlogPost();

    post1.author = "John Doe";
    post1.title = "Lorem Ipsum";
    post1.text = "Lorem ipsum dolor sit amet.";
    post1.publicationDate = "2000.05.04.";

    post2.author = "Tim Urban";
    post2.title = "Wait but why";
    post2.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";
    post2.publicationDate = "2010.10.10.";

    post3.author = "William Turton";
    post3.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
    post3.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention." +
            " When I asked to take his picture outside one of IBM’s New York City offices," +
            " he told me that he wasn’t really into the whole organizer profile thing.";
    post3.publicationDate = "2017.03.28.";
  }
}
