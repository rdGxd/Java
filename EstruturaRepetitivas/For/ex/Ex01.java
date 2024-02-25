package EstruturaRepetitivas.For.ex;

import java.util.Locale;
import java.util.Scanner;

public class Ex01 {
  public static void ex01(String[] args) {
    // Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1
    // até X, um valor por linha, inclusive o
    // X, se for o caso.

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    for (int i = 1; i < N; i++) {
      if (i % 2 != 0) {
        System.out.println(i);
      }
    }

    sc.close();
  }
}
