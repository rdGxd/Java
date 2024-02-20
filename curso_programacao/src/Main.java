import java.util.Locale;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
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