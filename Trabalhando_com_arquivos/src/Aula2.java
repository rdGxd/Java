import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Aula2 {
  public static void aula2(String[] args) throws Exception {
    // PROCESSO MANUAL
    String path = "C:\\Users\\rodri\\Documents\\in.txt";
    FileReader fr = null;
    BufferedReader br = null;

    try {
      fr = new FileReader(path);
      br = new BufferedReader(fr);

      String line = br.readLine();

      while (line != null) {
        System.out.println(line);
        line = br.readLine();
      }
    } catch (Exception e) {
      System.out.println("ERROR: " + e.getMessage());
    } finally {
      try {
        if (br != null) {
          br.close();
        }
        if (fr != null) {
          fr.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
