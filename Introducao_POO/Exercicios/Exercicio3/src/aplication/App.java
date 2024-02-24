package aplication;

import java.util.Locale;
import java.util.Scanner;

import entites.Student;

public class App {
  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Student student = new Student();

    System.out.println("Digite o nome do aluno: ");
    student.name = sc.nextLine();

    System.out.println("Digite as notas dos 3 trimestres aluno: ");
    student.grade1 = sc.nextDouble();
    student.grade2 = sc.nextDouble();
    student.grade3 = sc.nextDouble();

    System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());
    student.situation();

    sc.close();
  }
}
