package EstruturaSequencial.aula2_TesteProcessamento.Ex;

import java.util.Locale;
import java.util.Scanner;

public class Ex06 {
  public static void ex06(String[] args) {
    // Fazer um programa que leia três valores com ponto flutuante de dupla
    // precisão: A, B e C. Em seguida, calcule e
    // mostre:
    // a) a área do triângulo retângulo que tem A por base e C por altura.
    // b) a área do círculo de raio C. (pi = 3.14159)
    // c) a área do trapézio que tem A e B por bases e C por altura.
    // d) a área do quadrado que tem lado B.
    // e) a área do retângulo que tem lados A e B.

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    double valorA, valorB, valorC, pi, resultado;
    pi = 3.14159;

    valorA = sc.nextDouble();
    valorB = sc.nextDouble();
    valorC = sc.nextDouble();

    resultado = (valorA * valorC) / 2;
    System.out.printf("TRIANGULO =  %.3f%n", resultado);

    resultado = pi * (Math.pow(valorC, 2));
    System.out.printf("CIRCULO =  %.3f%n", resultado);

    resultado = ((valorA + valorB) * valorC) / 2;
    System.out.printf("TRAPEZIO =  %.3f%n", resultado);

    resultado = (Math.pow(valorB, 2));
    System.out.printf("QUADRADO =  %.3f%n", resultado);

    resultado = valorA * valorB;
    System.out.printf("RETANGULO =  %.3f%n ", resultado);

    sc.close();
  }
}