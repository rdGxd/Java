import java.util.Locale;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    double price = 400.00;
    double discount;

    if (price < 200) {
      discount = price * 0.1;
    } else {
      discount = 0;
    }

    System.out.println(discount);
    sc.close();
  }
}
