package EstruturaCondicional.Aulas;

import java.util.Locale;
import java.util.Scanner;

public class Aula02 {
  public static void aula02(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int dia = sc.nextInt();

    // Sintaxe opcional
    switch (dia) {
      case 1:
        System.out.println("Dia da semana: Domingo");
        break;
      case 2:
        System.out.println("Dia da semana: Segunda");
        break;
      case 3:
        System.out.println("Dia da semana: Terça");
        break;
      case 4:
        System.out.println("Dia da semana: Quarta");
        break;
      case 5:
        System.out.println("Dia da semana: Quinta");
        break;
      case 6:
        System.out.println("Dia da semana: Sexta");
        break;
      case 7:
        System.out.println("Dia da semana: Sábado");
        break;
      default:
        System.out.println("Dia da semana: valor inválido");
        break;
    }

    sc.close();
  }
}
