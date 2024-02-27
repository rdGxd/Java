import java.util.Locale;
import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos elementos o vetor vai ter? ");
    int n = sc.nextInt();
    double[] vect = new double[n];

    for (int i = 0; i < vect.length; i++) {
      System.out.print("Digite um número: ");
      vect[i] = sc.nextDouble();
    }

    double avg = 0.0;
    for (int i = 0; i < vect.length; i++) {
      avg += vect[i];
    }

    System.out.println();
    System.out.println("MEDIA DO VETOR = " + avg / 4);

    System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
    for (int i = 0; i < vect.length; i++) {
      if (vect[i] < (avg / 4)) {
        System.out.println(vect[i]);
      }
    }

    sc.close();
  }
}
