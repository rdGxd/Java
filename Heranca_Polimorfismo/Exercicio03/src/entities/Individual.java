package entities;

public class Individual extends TaxPayer {
  private Double healthExpenditures;

  public Individual() {
  }

  public Individual(String name, Double anualIncome, Double healthExpenditures) {
    super(name, anualIncome);
    this.healthExpenditures = healthExpenditures;
  }

  public Double getHealthExpenditures() {
    return healthExpenditures;
  }

  public void setHealthExpenditures(Double healthExpenditures) {
    this.healthExpenditures = healthExpenditures;
  }

  @Override
  public double tax() {
    double finalTax = 0.0;

    if (getAnualIncome() > 20000.00 && getHealthExpenditures() > 0) {
      finalTax = (getAnualIncome() * 25 / 100) - (getHealthExpenditures() * 50 / 100);
    } else if (getAnualIncome() < 20000.00) {
      finalTax = getAnualIncome() * 15 / 100;
    } else if (getAnualIncome() > 20000.00) {
      finalTax = (getAnualIncome() * 25 / 100);
    }

    return finalTax;
  }

}
