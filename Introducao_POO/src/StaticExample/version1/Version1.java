package StaticExample.version1;

import java.util.Locale;
import java.util.Scanner;

public class Version1 {
    // Final serve para avisar que um VALOR CONSTANTE
  public static final double PI = 3.14159;

  public static void version1(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter radius: ");
    double radius = sc.nextDouble();

    double c = circumFerence(radius);
    double v = volume(radius);

    System.out.printf("Circumference: %.2f%n", c);
    System.out.printf("Volume: %.2f%n", v);
    System.out.printf("PI value: %.2f%n", PI);

    sc.close();
  }

  public static double circumFerence(double radius) {
    return 2.0 * PI * radius;
  }

  public static double volume(double radius) {
    return 4.0 * PI * radius * radius * radius / 3;
  }
}
