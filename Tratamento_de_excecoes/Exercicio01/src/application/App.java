package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class App {
  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    try {
      System.out.println("Enter account data: ");
      System.out.print("Number: ");
      int number = sc.nextInt();
      sc.nextLine();
      System.out.print("Holder: ");
      String holder = sc.nextLine();
      System.out.print("Initial balance: ");
      Double balance = sc.nextDouble();
      System.out.print("Withdraw limit: ");
      Double withdraw = sc.nextDouble();
      Account account = new Account(number, holder, balance, withdraw);
      System.out.println();

      System.out.print("Enter amount for withdraw: ");
      Double draw = sc.nextDouble();
      account.withdraw(draw);
      System.out.printf("New balance: %.2f%n", account.getBalance());
    } catch (DomainException e) {
      System.out.println("Withdraw error: " + e.getMessage());
    }

    sc.close();
  }
}
