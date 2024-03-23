package entities;

public record Product(String name, Double price) implements Comparable<Product> {

    @Override
    public String toString() {
        return name() + ", " + String.format("%.2f", price());
    }

    @Override
    public int compareTo(Product other) {
        return price.compareTo(other.price());
    }
}
