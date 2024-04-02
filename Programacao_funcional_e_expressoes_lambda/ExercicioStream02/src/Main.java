import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();

        System.out.print("Enter salary: ");
        Double n = sc.nextDouble();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Employee> list = new ArrayList<>();
            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            List<String> email = list.stream()
                    .filter(e -> e.getSalary() > n)
                    .map(e -> e.getEmail())
                    .sorted()
                    .toList();

            System.out.println("Email of people whose salary is more than " + String.format("%.2f", n));
            email.forEach(System.out::println);

            double salary = list.stream()
                    .filter(e -> e.getName().toUpperCase().charAt(0) == 'M')
                    .map(e -> e.getSalary())
                    .reduce(0.0, (x, y) -> x + y);


            System.out.printf("Sum of salary of people whose name starts with 'M': %.2f%n", salary);

        } catch (IOException e) {
            System.out.println("ERROR " + e.getMessage());
        }


    }
}