package EstruturaRepetitivas.ex;

import java.util.Locale;
import java.util.Scanner;

public class Ex01 {
    public static void ex01(String[] args) {

// Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
// incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
// impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int x = sc.nextInt();

    while (x != 2002) {
      System.out.println("Senha inválida");
      x = sc.nextInt();
    }

    System.out.println("Senha Acesso permitido");

    sc.close();
  }
}
