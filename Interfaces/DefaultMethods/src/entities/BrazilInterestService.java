package entities;

public class BrazilInterestService implements InterestService {
  private final Double interestRate;

  public BrazilInterestService(Double interestRate) {
    this.interestRate = interestRate;
  }

  @Override
  public double getInterestRage() {
    return interestRate;
  }
}
