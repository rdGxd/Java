import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Aula2 {
  public static void aula2(String[] args) throws Exception {
    File file = new File("C:\\temp\\in.txt");
    Scanner sc = null;

    try {
      sc = new Scanner(file);
      while (sc.hasNextLine()) {
        System.out.println(sc.nextLine());
      }
    } catch (FileNotFoundException e) {
      System.out.println("Error opening file: " + e.getMessage());
    } finally {
      if (sc != null) {
        sc.close();
      }
      System.out.println("Finally block executed");
    }
  }

}
