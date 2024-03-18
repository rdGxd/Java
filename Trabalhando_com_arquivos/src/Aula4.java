import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Aula4 {
  public static void aula4(String[] args) throws Exception {
    // Criando o arquivo e gravando os dados nele
    String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };

    String path = "C:\\Users\\rodri\\Documents\\out.txt";

    // Quando colocado o parâmetro TRUE ele apenas acrescenta ao arquivo e nao recria ele
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
      for (String line : lines) {
        bw.write(line);
        bw.newLine();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
