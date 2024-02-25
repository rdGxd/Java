package entities;

public class Bank {
  private String name;
  private int account;
  private double value;

  public Bank(String name, int account, double initial) {
    this.name = name;
    this.account = account;
    addValueAccount(initial);
  }

  public Bank(String name, int account) {
    this.name = name;
    this.account = account;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public int getAccount() {
    return account;
  }

  public double getValue() {
    return value;
  }

  public void addValueAccount(double value) {
    this.value += value;
  }

  public void removeValueAccount(double value) {
    this.value -= (value + 5.00);
  }

  public String toString() {
    return "Account: " + account + ", Name: " + name + ", Saldo: " + String.format("%.2f", value);
  }
}
