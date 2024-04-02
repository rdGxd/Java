import entities.Product;
import util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // Instanciando a interface
        // list.removeIf(new ProductPredicate());

        // No Static
        // list.removeIf(Product::nonStaticProductPredicate);

        // Expressão lambda declarada
        // Predicate<Product> pred = p -> p.getPrice() >= 100.00;
        // list.removeIf(pred);

        // Expressão lambda inline
        list.removeIf(p -> p.getPrice() >= 100.00);

        // Referencia para o método estático
        // list.removeIf(Product::staticProductPredicate);

        for (Product p : list) {
            System.out.println(p);
        }
    }
}