import java.io.File;
import java.util.Scanner;

public class Aula1 {
  public static void aula1(String[] args) throws Exception {
    // Lendo um arquivo de modo simples
    File file = new File("C:\\Users\\rodri\\Documents\\in.txt");
    Scanner sc = null;
    try {
      sc = new Scanner(file);
      while (sc.hasNextLine()) {
        System.out.println(sc.nextLine());
      }
    } catch (Exception e) {
      System.out.println("Error" + e.getMessage());
    } finally {
      if (sc != null) {
        sc.close();
      }
    }
  }
}
