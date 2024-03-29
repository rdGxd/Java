package entities;

public class Employee implements Comparable<Employee> {
	private final String name;
	private final Double salary;

	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public Double getSalary() {
		return salary;
	}


	@Override
	public int compareTo(Employee other) {
		return -salary.compareTo(other.getSalary());
	}
}
