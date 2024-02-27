import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class App {
  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantas pessoas serão digitadas: ");
    int n = sc.nextInt();
    Pessoa[] vect = new Pessoa[n];

    // Adicionando pessoas
    for (int i = 0; i < vect.length; i++) {
      sc.nextLine();
      System.out.printf("Dados da %da pessoa:%n", i + 1);
      System.out.print("Nome: ");
      String name = sc.nextLine();
      System.out.print("Idade: ");
      int idade = sc.nextInt();
      System.out.print("Altura: ");
      double altura = sc.nextDouble();
      vect[i] = new Pessoa(name, idade, altura);
    }

    // Calculando a média de altura e idade
    double avg = 0;
    double menor = 0;
    for (int i = 0; i < vect.length; i++) {
      avg += vect[i].getAltura();
      if (vect[i].getIdade() < 16) {
        menor++;
      }
    }

    System.err.println();
    System.out.printf("Altura média: %.2f%n", avg / vect.length);
    System.out.printf("Pessoas com menos de 16 anos: %.2f%% %n", menor / vect.length * 100);
    for (int i = 0; i < vect.length; i++) {
      if (vect[i].getIdade() < 16) {
        System.out.println(vect[i].getName());

      }
    }

    sc.close();
  }
}
