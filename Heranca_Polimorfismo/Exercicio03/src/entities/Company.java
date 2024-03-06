package entities;

public class Company extends TaxPayer {
  private Integer numberOfEmployees;

  public Company() {
  }

  public Company(String name, Double anualIncome, Integer numberOfEmployees) {
    super(name, anualIncome);
    this.numberOfEmployees = numberOfEmployees;
  }

  public Integer getNumberOfEmployees() {
    return numberOfEmployees;
  }

  public void setNumberOfEmployees(Integer numberOfEmployees) {
    this.numberOfEmployees = numberOfEmployees;
  }

  @Override
  public double tax() {
    double finalTax = 0.0;

    if (numberOfEmployees > 16) {
      finalTax = getAnualIncome() * 14 / 100;
    } else {
      finalTax = getAnualIncome() * 16 / 100;
    }
    return finalTax;
  }

}
