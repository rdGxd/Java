package entities;

public class Product {
    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    // Método estátacio ele trabalha com o produto que é passado como argumento para ele
    public static  boolean staticProductPredicate(Product p) {
        return p.getPrice() >= 100.00;
    }

    // Método nao estático é o método da instancia vai trabalhar com o proprio objeto
    public boolean nonStaticProductPredicate() {
        return getPrice() >= 100.00;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + getName() + '\'' +
                ", price=" + String.format("%.2f", getPrice()) +
                '}';
    }
}
