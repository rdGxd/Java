import entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // Instanciando o Consumer
        // list.forEach(new PriceUpdate()); // O forEach vai percorrer a lista aplicando o consumer

        // Reference method com o método estático
        // list.forEach(Product::staticPriceUpdate);

        // Reference method com o método não estático
        // list.forEach(Product::nonStaticPriceUpdate);

        // Expressão lambda declarada
        // Consumer<Product> cons = p -> {
           //  p.setPrice(p.getPrice() * 1.1);
        // };
        // list.forEach(cons);

        // Expressão lambda inline
        list.forEach(product -> product.setPrice(product.getPrice() * 1.1));


        // Usando um reference method para o method println
        list.forEach(System.out::println);
    }
}