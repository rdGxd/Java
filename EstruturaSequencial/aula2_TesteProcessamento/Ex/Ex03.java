package EstruturaSequencial.aula2_TesteProcessamento.Ex;

import java.util.Scanner;

public class Ex03 {
  // Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
  // calcule e mostre a diferença do produto
  // de A e B pelo produto de C e D segundo a fórmula: DIFERENÇA = (A * B - C * D)

    public static void ex03(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A, B, C, D, resultado;

    A = sc.nextInt();
    B = sc.nextInt();
    C = sc.nextInt();
    D = sc.nextInt();
    resultado = A * B - C * D;

    System.out.printf("DIFERENÇA = %d", resultado);

    sc.close();
  }
}
