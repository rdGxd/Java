import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class App {
  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    List<Product> list = new ArrayList<>();

    System.out.print("Enter the number of products: ");
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      sc.nextLine();
      System.out.print("Common, used or imported (c/u/i)? ");
      char ch = sc.next().toLowerCase().charAt(0);
      sc.nextLine();
      System.out.print("Name: ");
      String name = sc.nextLine();
      System.out.print("Price: ");
      double price = sc.nextDouble();
      if (ch == 'i') {
        System.out.print("Customs fee: ");
        double customsFee = sc.nextDouble();
        list.add(new ImportedProduct(name, price, customsFee));
      } else if (ch == 'c') {
        list.add(new Product(name, price));
      } else {
        System.out.print("Manufacture date (DD/MM/YYYY): ");
        Date date = sdf.parse(sc.next());
        list.add(new UsedProduct(name, price, date));
      }
    }

    System.out.println();
    System.out.println("PRICE TAGS:");
    for (Product product : list) {
      System.out.println(product.priceTag());
    }

    sc.close();
  }
}
