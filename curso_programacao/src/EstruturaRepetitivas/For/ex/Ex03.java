package EstruturaRepetitivas.For.ex;

import java.util.Locale;
import java.util.Scanner;

public class Ex03 {
  public static void ex03(String[] args) {

    // Leia 1 valor inteiro N, que representa o número de casos de teste que vem a
    // seguir. Cada caso de teste consiste
    // de 3 valores reais, cada um deles com uma casa decimal. Apresente a média
    // ponderada para cada um destes
    // conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo
    // valor tem peso 3 e o terceiro valor tem
    // peso 5.

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    for (int i = 0; i < N; i++) {
      double x = sc.nextDouble();
      double y = sc.nextDouble();
      double z = sc.nextDouble();

      double resultado = ((x * 2) + (y * 3) + (z * 5)) / 10;
      // double peso = 2 + 3 + 5;
      // double resultado = soma / peso;
      System.err.printf("%.1f%n", resultado);
    }

    sc.close();
  }
}
