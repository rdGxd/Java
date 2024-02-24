package entites;

import java.io.PrintStream;

public class Student {
  public String name;
  public double grade1;
  public double grade2;
  public double grade3;

  double fullMark = 100.00;

  public double finalGrade() {
    return (grade1) + (grade2) + (grade3);
  }

  public PrintStream situation() {
    if (finalGrade() >= 60.00) {
      return System.out.printf("PASS");
    } else {
      return System.out.printf("FAILED%nMISSING %.2f POINTS", 60.00 - finalGrade());
    }
  }
}
