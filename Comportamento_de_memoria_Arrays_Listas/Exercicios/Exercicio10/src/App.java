import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class App {
  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos alunos serão digitados? ");
    int n = sc.nextInt();
    Aluno[] vect = new Aluno[n];

    for (int i = 0; i < n; i++) {
      sc.nextLine();
      System.out.printf("Digite nome, primeira e segunda nota do %do aluno: %n", i + 1);
      String name = sc.nextLine();
      double nota1 = sc.nextDouble();
      double nota2 = sc.nextDouble();
      vect[i] = new Aluno(name, nota1, nota2);
    }

    System.out.println("ALUNOS APROVADOS:");
    for (int i = 0; i < n; i++) {
      double mediaFinal = (vect[i].getNota1() + vect[i].getNota2()) / 2;

      if (mediaFinal >= 6) {
        System.out.println(vect[i].getName());
      }
    }

    sc.close();
  }
}
