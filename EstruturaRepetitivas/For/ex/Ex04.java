package EstruturaRepetitivas.For.ex;

import java.util.Locale;
import java.util.Scanner;

public class Ex04 {
  public static void ex04(String[] args) {

    // Fazer um programa para ler um número N. Depois leia N pares de números e
    // mostre a divisão do primeiro pelo
    // segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao
    // impossivel".

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    for (int i = 0; i < N; i++) {
      double x = sc.nextDouble();
      double y = sc.nextDouble();

      if (x < 0) {
        System.out.println("Divisão impossivel");
      } else {
        double resultado = x / y;
        System.out.println(resultado);
      }
    }

    sc.close();
  }
}
