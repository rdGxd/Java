import java.io.File;
import java.util.Scanner;

public class Aula5 {
  public static void aula5(String[] args) throws Exception {
    // Manipulando pastas com file
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a folder path: ");
    String strPath = sc.nextLine();

    // Pegando as pastas
    File path = new File(strPath);
    File[] folders = path.listFiles(File::isDirectory);
    System.out.println("FOLDERS:");
    for (File folder : folders) {
      System.out.println(folder);
    }

    // Pegando os arquivos
    File[] files = path.listFiles(File::isFile);
    System.out.println("FILES:");
    for (File file : files) {
      System.out.println(file);
    }

    // Criando uma subpasta
    boolean success = new File(strPath + "\\subdir").mkdir();
    System.out.println("Directory created successfully: " + success);

    sc.close();
  }
}
