package entities;

public class UsaInterestService implements InterestService {
  private final Double interestRate;

  public UsaInterestService(Double interestRate) {
    this.interestRate = interestRate;
  }

  @Override
  public double getInterestRage() {
    return interestRate;
  }
}
