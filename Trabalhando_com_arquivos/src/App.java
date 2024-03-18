import java.io.BufferedReader;
import java.io.FileReader;

public class App {
  public static void main(String[] args) throws Exception {
    // Processo Melhorado
    String path = "C:\\Users\\rodri\\Documents\\in.txt";

    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
      String line = br.readLine();

      while (line != null) {
        System.out.println(line);
        line = br.readLine();
      }
    } catch (Exception e) {
      System.out.println("ERROR: " + e.getMessage());
    }
  }
}
