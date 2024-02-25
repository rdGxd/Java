package EstruturaRepetitivas.For.ex;

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {
  public static void ex05(String[] args) {
    // Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N =
    // N * (N-1) * (N-2) * (N-3) * ... * 1.
    // Lembrando que, por definição, fatorial de 0 é 1

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int fat = 1;

    for (int i = 1; i <= N; i++) {
      fat *= i;
    }

    System.out.println(fat);

    sc.close();
  }
}
