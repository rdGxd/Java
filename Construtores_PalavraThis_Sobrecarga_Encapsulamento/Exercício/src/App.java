import java.util.Locale;
import java.util.Scanner;

import entities.Bank;

public class App {
  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    Bank banco;

    System.out.println("Insira os dados para a criação da conta: ");
    System.out.print("Número da conta: ");
    int accountNumber = sc.nextInt();
    sc.nextLine();

    System.err.println();
    System.out.print("Nome: ");
    String name = sc.nextLine();

    System.err.println();
    System.out.print("Deseja fazer um deposito inicial (s/n)? ");
    char r = sc.nextLine().toLowerCase().charAt(0);

    if (r == 's') {
      System.err.println();
      System.out.print("Valor para o depositado inicial: ");
      double value = sc.nextDouble();
      banco = new Bank(name, accountNumber, value);
    } else {
      banco = new Bank(name, accountNumber);
    }

    System.err.println();
    System.out.println("Account data: ");
    System.out.println(banco);

    System.err.println();
    System.out.print("Quanto você deseja depositar: ");
    double deposito = sc.nextDouble();
    banco.addValueAccount(deposito);
    System.out.println("Saldo atualizado: ");
    System.out.println(banco);

    System.err.println();
    System.out.print("Quanto você deseja sacar: ");
    deposito = sc.nextDouble();
    banco.removeValueAccount(deposito);
    System.out.println("Saldo atualizado: ");
    System.out.println(banco);

    sc.close();
  }
}
