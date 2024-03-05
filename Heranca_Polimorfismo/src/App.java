import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class App {
  public static void main(String[] args) throws Exception {
    Account acc1 = new Account(1001, "Rodrigo", 1000.00);
    acc1.withdraw(200.00);
    System.out.println(acc1.getBalance());

    Account acc2 = new SavingsAccount(1002, "Maria", 1000.00, 0.01);
    acc2.withdraw(200.00);
    System.out.println(acc2.getBalance());

    Account acc3 = new BusinessAccount(1003, "Alex ", 1000.00, 500.00);
    acc3.withdraw(200.00);
    System.out.println(acc3.getBalance());
  }
}
