package EstruturaSequencial.aula2_TesteProcessamento.Ex;

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
  // Faça um programa para ler o valor do raio de um círculo, e depois mostrar o
  // valor da área deste círculo com quatro casas decimais conforme exemplos.

  // Fórmula da área: area = π . raio2

  // Considere o valor de π = 3.14159

    public static void ex02(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    double raio, t, area;

    raio = sc.nextDouble();
    t = 3.14159;
    area = t * Math.pow(raio, 2);
    System.out.printf("A=%.4f%n", area);

    sc.close();
  }
}
