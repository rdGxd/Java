package entities;

public class Product {
  public String name;
  public double price;
  public int quantity;

  // Construtor padrão
  public Product() {}

  // Sobrecarga
  public Product(String name, double price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  // Sobrecarga com argumento opcional
  public Product(String name, double price) {
    this.name = name;
    this.price = price;
    // quantity = 0; // OPCIONAL
  }

  public double totalValueInStock() {
    return price * quantity;
  }

  public void addProducts(int quantity) {
    this.quantity += quantity;
  }

  public void removeProducts(int quantity) {
    this.quantity -= quantity;
  }

  public String toString() {
    return name
        + ", $ "
        + String.format("%.2f", price)
        + ", "
        + quantity
        + " units, Total: $ "
        + String.format("%.2f", totalValueInStock());
  }

}
