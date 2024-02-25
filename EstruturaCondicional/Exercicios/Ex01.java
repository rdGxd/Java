package EstruturaCondicional.Exercicios;

import java.util.Scanner;

public class Ex01 {

  public static void ex01(String[] args) {
    // Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
    Scanner sc = new Scanner(System.in);
    int numero;

    System.out.println("Digite um número:");
    numero = sc.nextInt();

    if (numero < 0) {
      System.out.println("NEGATIVO");
    } else {
      System.out.println("NÃO NEGATIVO");
    }

    sc.close();
  }
}
