package EstruturaCondicional.Exercicios;

import java.util.Scanner;

public class Ex02 {
  public static void ex02(String[] args) {
    // Fazer um programa para ler um número inteiro e dizer se este número é par ou
    // ímpar.

    Scanner sc = new Scanner(System.in);
    int numero, resultado;

    System.out.println("Digite um número:");
    numero = sc.nextInt();
    resultado = numero % 2;

    if (resultado == 0) {
      System.out.println("PAR");
    } else {
      System.out.println("IMPAR");
    }

    sc.close();
  }
}
