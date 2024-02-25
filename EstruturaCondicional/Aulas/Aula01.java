package EstruturaCondicional.Aulas;

import java.util.Locale;
import java.util.Scanner;

public class Aula01 {
  public static void aula01(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int minutos = sc.nextInt();

    double conta = 50.0;

    if (minutos > 100) {
      // Sintaxe opcional
      conta += (minutos - 100) * 2.0;
    }

    System.out.printf("Valor da conta = R$ %.2f%n", conta);

    sc.close();
  }
}
