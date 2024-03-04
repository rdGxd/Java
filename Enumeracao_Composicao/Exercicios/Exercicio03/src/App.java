import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class App {
  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    Order order = new Order();

    System.out.println("Enter client data:");
    System.out.print("Name: ");
    String name = sc.nextLine();
    System.out.print("Email: ");
    String email = sc.nextLine();
    System.out.print("Birth date (DD/MM/YYYY): ");
    Date birthDate = sdf.parse(sc.next());
    sc.nextLine();

    System.out.println("Enter order data: ");
    System.out.print("STATUS: ");
    String orderStatus = sc.nextLine();
    OrderStatus status = OrderStatus.valueOf(orderStatus);

    Client client = new Client(name, email, birthDate);

    System.out.println();
    System.out.print("How many item to this order? ");
    int n = sc.nextInt();

    System.out.println();
    for (int i = 0; i < n; i++) {
      sc.nextLine();
      System.out.println();
      System.out.printf("Enter #%d item data:%n", i + 1);
      System.out.print("Product name: ");
      String productName = sc.nextLine();
      System.out.print("Product price: ");
      double productPrice = sc.nextDouble();
      System.out.print("Quantity: ");
      int quantity = sc.nextInt();

      Product product = new Product(productName, productPrice);
      OrderItem orderItem = new OrderItem(quantity, productPrice, product);

      order.addItem(orderItem);
      order.setStatus(status);
      order.setClient(client);
    }

    System.out.println();
    System.out.print("ORDER SUMMARY: ");
    System.out.println(order);

    sc.close();
  }
}
