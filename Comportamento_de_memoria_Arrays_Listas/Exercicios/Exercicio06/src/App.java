import java.util.Locale;
import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos números voce vai digitar? ");
    int n = sc.nextInt();
    int[] vectA = new int[n];
    int[] vectB = new int[n];

    System.out.println("Digite os valores do vetor A: ");
    for (int i = 0; i < n; i++) {
      int num = sc.nextInt();
      vectA[i] = num;
    }

    System.out.println("Digite os valores do vetor B: ");
    for (int i = 0; i < n; i++) {
      int num = sc.nextInt();
      vectB[i] = num;
    }

    System.out.println("VETOR RESULTANTE:");
    for (int i = 0; i < n; i++) {
      System.out.printf("%d%n", vectA[i] + vectB[i]);
    }

    sc.close();
  }
}
