package OutrosTopicos;

import java.util.Locale;
import java.util.Scanner;

public class Aula01 {
    public static void aula01(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int mask = 0b00100000;
    int n = sc.nextInt();

    if ((n & mask) != 0) {
      System.out.println("6th bit is true!");
    } else {
      System.out.println("6th bit is false!");
    };

    sc.close();
  }
}
