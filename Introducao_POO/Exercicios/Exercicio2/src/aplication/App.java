package aplication;

import java.util.Locale;
import java.util.Scanner;

import entites.Employee;

public class App {
  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Employee employee;
    employee = new Employee();

    System.out.println("Enter your data Employee: ");
    System.out.print("Name: ");
    employee.name = sc.nextLine();
    System.err.println();
    System.out.print("Gross salary: ");
    employee.grossSalary = sc.nextDouble();
    System.err.println();
    System.out.print("Tax: ");
    employee.tax = sc.nextDouble();
    System.err.println();

    System.out.printf("Employee: %s, $ %.2f%n", employee.name, employee.netSalary());

    System.out.print("Which percentage to increase salary? ");
    double percentage = sc.nextDouble();
    employee.increaseSalary(percentage);

    System.out.printf("Updated data: %s, $ %.2f%n", employee.name, employee.salary);

    sc.close();
  }
}
