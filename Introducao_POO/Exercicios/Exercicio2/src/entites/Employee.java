package entites;

public class Employee {
  public String name;
  public double grossSalary;
  public double tax;

  public double salary;

  public double netSalary() {
    return salary = grossSalary - tax;
  }

  public void increaseSalary(double percentage) {
    salary += (grossSalary * percentage / 100);
  }
}
