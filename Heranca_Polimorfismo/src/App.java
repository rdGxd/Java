import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class App {
  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    List<Account> list = new ArrayList<>();

    list.add(new SavingsAccount(1001, "Alex", 500.00, 1000.00));
    list.add(new SavingsAccount(1002, "Alex", 1500.00, 1400.00));
    list.add(new BusinessAccount(1003, "Alex", 550.00, 400.00));
    list.add(new BusinessAccount(1004, "Ana", 580.00, 500.00));

    double sum = 0.00;
    for (Account acc : list) {
      sum += acc.getBalance();
    }

    System.out.printf("TOTAL BALANCE: %.2f%n", sum);

    for (Account acc : list) {
      acc.deposit(10.00);
    }

    for (Account acc : list) {
      System.out.printf("UPDATED BALANCE FOR ACCOUNT %d: %.2f%n", acc.getNumber(), acc.getBalance());
    }
  }
}
