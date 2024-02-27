import java.util.Locale;
import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos números voce vai digitar? ");
    int n = sc.nextInt();
    int[] vect = new int[n];

    for (int i = 0; i < vect.length; i++) {
      System.out.print("Digite um numero: ");
      vect[i] = sc.nextInt();
    }

    int quantidade = 0;
    System.err.println();
    System.out.println("NÚMEROS PARES: ");
    for (int i = 0; i < vect.length; i++) {
      if (vect[i] % 2 == 0) {
        quantidade++;
        System.out.printf("%d ", vect[i]);
      }
    }

    System.out.println();
    System.out.println("Quantidade de pares: " + quantidade);
    sc.close();
  }
}
