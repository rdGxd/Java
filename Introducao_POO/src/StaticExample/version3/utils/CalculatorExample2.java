package StaticExample.version3.utils;

public class CalculatorExample2 {
  // Final serve para avisar que um VALOR CONSTANTE
  public static final double PI = 3.14159;

  public static double circumFerence(double radius) {
    return 2.0 * PI * radius;
  }

  public static double volume(double radius) {
    return 4.0 * PI * radius * radius * radius / 3;
  }
}
