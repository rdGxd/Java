package entities;

// Ao colocar a palavra FINAL você indica que essa classe nao pode ser herdada
public final class SavingsAccount extends Account {
  private Double interestRate;

  public SavingsAccount() {
    super();
  }

  public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
    super(number, holder, balance);
    this.interestRate = interestRate;
  }

  public Double getInterestRate() {
    return interestRate;
  }

  public void setInterestRate(Double interestRate) {
    this.interestRate = interestRate;
  }

  public void updateBalance() {
    balance += balance * interestRate;
  }

  @Override // Informando que uma sobreposição
  // A palavra final no método indicia que o método nao pode ser sobreposto
  public final void withdraw(double amount) {
    balance -= amount;
  }
}
