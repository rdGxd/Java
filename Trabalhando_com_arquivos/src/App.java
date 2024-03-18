import java.io.File;
import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    // Manipulando pastas com file
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a file path: ");
    String strPath = sc.nextLine();

    File path = new File(strPath);
    // C:\Users\rodri\Documents\in.txt
    System.out.println("getName: " + path.getName());
    System.out.println("getParent: " + path.getParent());
    System.out.println("getPath: " + path.getPath());

    sc.close();
  }
}
