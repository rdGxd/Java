import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class App {
  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantas pessoas voce vai digitar? ");
    int n = sc.nextInt();
    Pessoa[] vect = new Pessoa[n];

    for (int i = 0; i < vect.length; i++) {
      sc.nextLine();
      System.out.printf("Dados da %da pessoa: %n", i + 1);
      System.out.print("Nome: ");
      String name = sc.nextLine();
      System.out.print("Idade: ");
      int idade = sc.nextInt();
      vect[i] = new Pessoa(name, idade);
    }

    int velho = 0;
    String nomePessoa = "";
    for (int i = 0; i < vect.length; i++) {
      if (vect[i].getIdade() > velho) {
        velho = vect[i].getIdade();
        nomePessoa = vect[i].getNome();
      }
    }

    System.out.println("PESSOA MAIS VELHA: " + nomePessoa);
    sc.close();
  }
}
