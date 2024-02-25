package EstruturaSequencial.aula2_TesteProcessamento.Ex;

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {
  public static void ex05(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    int codigoA, numeroA, codigoB, numeroB;
    double valorA, valorB, resultado;

    codigoA = sc.nextInt();
    numeroA = sc.nextInt();
    valorA = sc.nextDouble();

    codigoB = sc.nextInt();
    numeroB = sc.nextInt();
    valorB = sc.nextDouble();

    resultado = (valorA * numeroA) + (valorB * numeroB);

    System.out.printf("VALOR A PAGAR = R$ %.2f%n ", resultado);

    sc.close();
  }
}
