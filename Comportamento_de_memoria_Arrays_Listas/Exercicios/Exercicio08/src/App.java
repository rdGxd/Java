import java.util.Locale;
import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos elementos o vetor vai ter? ");
    int n = sc.nextInt();
    int[] vect = new int[n];

    for (int i = 0; i < vect.length; i++) {
      System.out.print("Digite um número: ");
      vect[i] = sc.nextInt();
    }

    double avg = 0;
    int par = 0;
    for (int i = 0; i < vect.length; i++) {
      if (vect[i] % 2 == 0) {
        avg += vect[i];
        par++;
      }
    }
    if (par == 0) {
      System.out.println("NENHUM NUMERO PAR");
    } else {
      System.out.printf("MEDIA DOS PARES = %.1f%n", avg / par);
    }

    sc.close();
  }
}
