import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class App {
  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    System.out.print("Enter department's name: ");
    String departmentName = sc.nextLine();

    System.out.println();
    System.out.println("Enter worker data:");
    System.out.print("Name: ");
    String workerName = sc.nextLine();

    System.out.print("Level: ");
    String workerLevel = sc.nextLine();

    System.out.print("Base Salary: ");
    Double baseSalary = sc.nextDouble();

    Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary,
        new Department(departmentName));

    System.out.println();
    System.out.print("How many contracts to this worker? ");
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      System.out.println();
      System.out.printf("Enter contract %d data:%n", i + 1);
      System.out.print("Date (DD/MM/YYYY): ");
      Date contractDate = sdf.parse(sc.next());
      System.out.print("Value por hour: ");
      double valuePerHour = sc.nextDouble();
      System.out.print("Duration (hours): ");
      int hours = sc.nextInt();

      HourContract contract = new HourContract(contractDate, valuePerHour, hours);
      worker.addContract(contract);
    }

    System.out.println();
    System.out.print("Enter month and year to calculate income (MM/YYYY): ");
    String monthAndYear = sc.next();
    int month = Integer.parseInt(monthAndYear.substring(0, 2));
    int year = Integer.parseInt(monthAndYear.substring(3));
    System.out.printf("Name: %s%n", worker.getName());
    System.out.printf("Department: %s%n", worker.getDepartment().getName());
    System.out.printf("Income for %s: %.2f", monthAndYear, worker.income(year, month));

    sc.close();
  }
}
