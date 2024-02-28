import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class App {
  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    List<Employee> employee = new ArrayList<>();

    // PART 1 - READING DATA:
    System.out.print("Quantos funcionários vc deseja registar ? ");
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      sc.nextLine();
      System.out.println();
      System.out.printf("Empregado #%d:%n", i + 1);
      System.out.print("Id: ");
      Integer employeeId = sc.nextInt();
      sc.nextLine();
      System.out.print("Name: ");
      String employeeName = sc.nextLine();
      System.out.print("Salary: ");
      Double employeeSalary = sc.nextDouble();

      employee.add(new Employee(employeeId, employeeName, employeeSalary));
    }

    // PART 2 - UPDATING SALARY OF GIVEN EMPLOYEE:
    System.out.println();
    System.out.print("Qual o ID do funcionário que você deseja aumentar o salário: ");
    Integer idFunc = sc.nextInt();

    Employee empregado = employee.stream().filter(x -> x.getId() == idFunc).findFirst().orElse(null);

    if (empregado == null) {
      System.out.println("ID não existe!");
    } else {
      System.out.print("Quantos porcentos você deseja aumentar: ");
      Double perce = sc.nextDouble();
      empregado.increaseSalary(perce);
    }

    // PART 3 - LISTING EMPLOYEES:
    System.out.println();
    System.out.println("Lista de funcionários:");
    for (Employee x : employee) {
      System.out.println(x);
    }

    sc.close();
  }
}
