package EstruturaSequencial.aula2_TesteProcessamento.Ex;

import java.util.Scanner;

public class Ex01 {
//   Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
// mensagem explicativa, conforme exemplos.

    public static void ex01(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b, c;

    a = sc.nextInt();
    b = sc.nextInt();
    c = a + b;

    System.out.printf("SOMA = %d", c);

    sc.close();
  }
}
