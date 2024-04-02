import entities.Product;
import util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // Instanciando o Function
        // A função map aplica uma função a cada elemento da stream gerando uma nova stream com os elementos transformados
        // A operação map só funciona para stream
        // List<String> names = list.stream().map(new UpperCaseName()).toList();

        // Reference method com o método estático
        // List<String> names = list.stream().map(Product::staticUpperCaseName).toList();

        // Reference method com o método não estático
        // List<String> names = list.stream().map(Product::nonStaticUpperCaseName).toList();

        // Expressão lambda declarada
        // Function<Product, String> func = product -> product.getName().toUpperCase();
        // List<String> names = list.stream().map(func).toList();

        // Expressão lambda inline
        List<String> names = list.stream().map(product -> product.getName().toUpperCase()).toList();

        // Usando um reference method para o method println
        names.forEach(System.out::println);
    }
}