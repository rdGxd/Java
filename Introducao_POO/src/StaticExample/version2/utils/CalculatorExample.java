package StaticExample.version2.utils;

public class CalculatorExample {
  // Final serve para avisar que um VALOR CONSTANTE
  public final double PI = 3.14159;

  public double circumFerence(double radius) {
    return 2.0 * PI * radius;
  }

  public double volume(double radius) {
    return 4.0 * PI * radius * radius * radius / 3;
  }
}
