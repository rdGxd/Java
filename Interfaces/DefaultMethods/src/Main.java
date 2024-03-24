import entities.BrazilInterestService;
import entities.InterestService;
import entities.UsaInterestService;

import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        System.out.print("Months: ");
        int months = sc.nextInt();

        BrazilInterestService is = new BrazilInterestService(2.0);
        InterestService isUSA = new UsaInterestService(1.0);
        double payment = is.payment(amount, months);
        double paymentUSA = isUSA.payment(amount, months);

        System.out.println("Payment after " + months + " months:");
        System.out.printf("%.2f%n", payment);
        System.out.println();
        System.out.println("USA Payment after " + months + " months:");
        System.out.printf("USA, %.2f%n", paymentUSA);
    }
}



