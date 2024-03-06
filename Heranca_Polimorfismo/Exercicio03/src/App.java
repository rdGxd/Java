import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class App {
  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    List<TaxPayer> list = new ArrayList<>();

    System.out.print("Enter the number of tax payers: ");
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      sc.nextLine();
      System.out.println();
      System.out.print("Individual or Company (i/c)? ");
      char ch = sc.next().toLowerCase().charAt(0);
      sc.nextLine();
      System.out.print("Name: ");
      String name = sc.nextLine();
      System.out.print("Anual income: ");
      double anual = sc.nextDouble();

      if (ch == 'i') {
        System.out.print("Health expenditures: ");
        double health = sc.nextDouble();
        list.add(new Individual(name, anual, health));
      } else {
        System.out.print("Number of employees: ");
        int employees = sc.nextInt();
        list.add(new Company(name, anual, employees));
      }
    }

    System.out.println();
    System.out.println("TAXES PAID: ");
    double sum = 0.0;
    for (TaxPayer p : list) {
      System.out.printf("%s: $ %.2f%n", p.getName(), p.tax());
      sum += p.tax();
    }

    System.out.println();
    System.out.printf("TOTAL TAXES: $ %.2f", sum);
    sc.close();
  }
}
