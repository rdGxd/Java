import java.util.Locale;
import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.printf("Quantos números você vai digitar? ");
    int n = sc.nextInt();

    if (n > 10) {
      System.err.println("Número máximo permitido é 10");
      sc.close();
      return;
    }

    int[] vect = new int[n];

    for (int i = 0; i < vect.length; i++) {
      System.out.print("Digite os números: ");
      vect[i] = sc.nextInt();
    }

    System.out.println("NÚMEROS NEGATIVOS: ");
    for (int i = 0; i < vect.length; i++) {
      if (vect[i] < 0) {
        System.out.println(vect[i]);
      }
    }

    sc.close();
  }
}
