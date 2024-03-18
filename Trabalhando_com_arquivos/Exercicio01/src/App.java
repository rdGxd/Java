import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class App {
  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a path file: ");
    String strPath = sc.nextLine();
    File path = null;
    List<Produto> list = new ArrayList<>();

    // Lendo o arquivo
    try (BufferedReader br = new BufferedReader(new FileReader(strPath))) {
      path = new File(strPath);
      sc = new Scanner(path);

      while (sc.hasNextLine()) {
        String[] newName = sc.nextLine().split(",");
        list.add(new Produto(newName[0], Double.parseDouble(newName[1]), Integer.parseInt(newName[2])));

      }
      new File(path.getParent() + "\\out").mkdir();
    } catch (IOException e) {
      e.printStackTrace();
    }

    // Escrevendo o novo arquivo
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(path.getParent() + "\\out" + "\\summary.csv"))) {
      for (Produto item : list) {
        bw.write(item.getName() + "," + String.format("%.2f", item.total()));
        bw.newLine();
      }
      bw.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
    sc.close();
  }
}
