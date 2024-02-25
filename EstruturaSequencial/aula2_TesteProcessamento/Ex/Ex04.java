package EstruturaSequencial.aula2_TesteProcessamento.Ex;

import java.util.Locale;
import java.util.Scanner;

public class Ex04 {
  // Fazer um programa que leia o número de um funcionário, seu número de horas
  // trabalhadas, o valor que recebe por
  // hora e calcula o salário desse funcionário. A seguir, mostre o número e o
  // salário do funcionário, com duas casas
  // decimais.

  public static void ex04(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    int A, B;
    double salario, resultado;

    A = sc.nextInt();
    B = sc.nextInt();
    salario = sc.nextDouble();
    resultado = salario * B;

    System.out.printf("NUMBER = %d%n", A);
    System.out.printf("SALARY = U$ %.2f%n ", resultado);

    sc.close();
  }
}
