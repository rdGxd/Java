import java.util.Locale;
import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos números voce vai digitar? ");
    int n = sc.nextInt();
    double[] vect = new double[n];

    for (int i = 0; i < vect.length; i++) {
      System.out.print("Digite um numero: ");
      vect[i] = sc.nextDouble();
    }

    double posicao = 0;
    double maior = 0;
    System.err.println();
    for (int i = 0; i < vect.length; i++) {
      if (vect[i] > maior) {
        maior = vect[i];
        posicao = i;
      }
    }

    System.out.println("Maior valor: = " + maior);
    System.out.println("Posição do maior valor = " + posicao);
    sc.close();
  }
}
