package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class App {
  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Rectangle rc;
    rc = new Rectangle();
    System.out.println("Enter rectangle width and height: ");
    rc.width = sc.nextDouble();
    rc.height = sc.nextDouble();

    System.out.println(rc);

    sc.close();
  }
}
