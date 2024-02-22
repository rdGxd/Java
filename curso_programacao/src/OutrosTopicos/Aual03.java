package OutrosTopicos;

import java.util.Locale;
import java.util.Scanner;

public class Aual03 {
  public static void aula03(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter three numbers: ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    int higher = max(a, b, c);
    showResult(higher);

    sc.close();
  };

  public static int max(int a, int b, int c) {
    if (a > b && a > c) {
      return a;
    } else if (b > c) {
      return b;
    } else {
      return c;
    }
  };

  // Quando a função simplesmente faz uma ação sem retornar um valor para ser
  // reaproveitado no programa o tipo de retorno dela é VOID
  public static void showResult(int value) {
    System.out.printf("Higher = %d", value);
  };
}
