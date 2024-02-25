package EstruturaRepetitivas.For.ex;

import java.util.Locale;
import java.util.Scanner;

public class Ex07 {
  public static void ex07(String[] args) {
    // Fazer um programa para ler um número inteiro positivo N. O programa deve
    // então mostrar na tela N linhas,
    // começando de 1 até N. Para cada linha, mostrar o número da linha, depois o
    // quadrado e o cubo do valor, conforme
    // exemplo

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    for (int i = 1; i <= N; i++) {
      double resultado = Math.pow(i, 1);
      double resultado2 = Math.pow(i, 2);
      double resultado3 = Math.pow(i, 3);
      System.out.printf("%.0f %.0f %.0f%n", resultado, resultado2, resultado3);
    }

    sc.close();
  }
}
