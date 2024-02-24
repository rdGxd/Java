package StaticExample.version2;

import java.util.Locale;
import java.util.Scanner;

import StaticExample.version2.utils.CalculatorExample;

public class Version2 {
  public static void version2(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    CalculatorExample calc = new CalculatorExample();

    System.out.print("Enter radius: ");
    double radius = sc.nextDouble();

    double c = calc.circumFerence(radius);
    double v = calc.volume(radius);

    System.out.printf("Circumference: %.2f%n", c);
    System.out.printf("Volume: %.2f%n", v);
    System.out.printf("PI value: %.2f%n", calc.PI);

    sc.close();
  }
}
