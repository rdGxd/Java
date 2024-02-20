package EstruturaCondicional.Exercicios;

import java.util.Scanner;

public class Ex05 {
  public static void ex05(String[] args) {
    // Com base na tabela abaixo, escreva um programa que leia o código de um item e
    // a quantidade deste item. A
    // seguir, calcule e mostre o valor da conta a pagar.

    Scanner sc = new Scanner(System.in);

    System.out.println("CODIGO - ESPECIFICAÇÃO - PREÇO");
    System.out.println("1 - Cachorro Quente - R$ 4.00");
    System.out.println("2 - X-Salada - R$ 4.50");
    System.out.println("3 - X-Bacon - R$ 5.00");
    System.out.println("4 - Torrada simples - R$ 2.00");
    System.out.println("5 - Refrigerante - R$ 1.50");

    double resultado;
    int A = sc.nextInt();
    int B = sc.nextInt();

    if (A == 1) {
      resultado = B * 4.00;
      System.out.println();
      System.out.printf("Total R$ %.2f%n", resultado);
    } else if (A == 2) {
      resultado = B * 4.50;
      System.out.println();
      System.out.printf("Total R$ %.2f%n", resultado);
    } else if (A == 3) {
      resultado = B * 5.00;
      System.out.println();
      System.out.printf("Total R$ %.2f%n", resultado);
    } else if (A == 4) {
      resultado = B * 2.00;
      System.out.println();
      System.out.printf("Total R$ %.2f%n", resultado);
    } else if (A == 5) {
      resultado = B * 1.50;
      System.out.println();
      System.out.printf("Total R$ %.2f%n", resultado);
    }

    sc.close();
  }
}
