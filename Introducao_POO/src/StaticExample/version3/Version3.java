package StaticExample.version3;

import java.util.Locale;
import java.util.Scanner;

import StaticExample.version3.utils.CalculatorExample2;

public class Version3 {
  public static void version3(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter radius: ");
    double radius = sc.nextDouble();

    double c = CalculatorExample2.circumFerence(radius);
    double v = CalculatorExample2.volume(radius);

    System.out.printf("Circumference: %.2f%n", c);
    System.out.printf("Volume: %.2f%n", v);
    System.out.printf("PI value: %.2f%n", CalculatorExample2.PI);

    sc.close();
  }
}
