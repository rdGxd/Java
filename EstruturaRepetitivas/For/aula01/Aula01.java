package EstruturaRepetitivas.For.aula01;

import java.util.Locale;
import java.util.Scanner;

public class Aula01 {
  public static void aula01(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int soma = 0;

    for (int i = 0; i < N; i++) {
      int x = sc.nextInt();
      soma += x;
    }

    System.out.println(soma);

    sc.close();
  }
}
