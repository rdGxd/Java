import java.util.Locale;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int x = sc.nextInt();
    int res = 0;

    while (x != 0) {
      res += x;
      x = sc.nextInt();
    }

    System.out.printf("A SOMA TOTAL DEU: %d", res);

    sc.close();
  }
}
