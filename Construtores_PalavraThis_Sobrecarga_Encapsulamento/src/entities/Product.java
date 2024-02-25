package entities;

public class Product {
  // Encapsulamento
  private String name;
  private double price;
  private int quantity;

  // Construtor padrão
  public Product() {
  }

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

  // Alterando o nome do produto
  public void setName(String name) {
    this.name = name;
  }

  // Pegando o nome do produto
  public String getName() {
    return name;
  }

  // Alterando o preço de um produto
  public void setPrice(double price) {
    this.price = price;
  }

  // Exibindo o preço do produto
  public double getPrice() {
    return price;
  }

  // Pegando a quantidade do produto
  public int getQuantity() {
    return quantity;
  }

  public double totalValueInStock() {
    return price * quantity;
  }

  // A quantidade do produto só vai mudar quando tiver uma entrada ou uma saída
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
