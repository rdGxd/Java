package EstruturaCondicional.Aulas;

import java.util.Locale;
import java.util.Scanner;

public class Aula03 {
  public static void aula03(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    double preco = sc.nextDouble();
    // Sintaxe opcional
    double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.5;
    System.out.println(desconto);
    sc.close();
  }
}
