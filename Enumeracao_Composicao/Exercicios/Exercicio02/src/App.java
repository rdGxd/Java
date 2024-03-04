import java.text.SimpleDateFormat;
import java.util.Locale;

import entities.Comment;
import entities.Post;

public class App {
  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    Comment c1 = new Comment("Have a nice trip!");
    Comment c2 = new Comment("Wow that's awesome!");
    Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zealand",
        "I'm going to visit this wonderful country!", 12);

    p1.addComments(c1);
    p1.addComments(c2);

    Comment c3 = new Comment("Good night");
    Comment c4 = new Comment("May the force be with you");
    Post p2 = new Post(sdf.parse("28/08/2718 13:05:44"), "Good night guys",
        "See you tomorrow", 5);

    p2.addComments(c3);
    p2.addComments(c4);

    System.out.println(p1);
    System.out.println(p2);
  }
}
