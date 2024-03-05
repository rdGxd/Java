package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
  private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

  private Date moment = new Date();
  private OrderStatus status;

  private List<OrderItem> orderItem = new ArrayList<>();
  private Client client;

  public Order(OrderStatus status, Client client) {
    this.moment = new Date();
    this.status = status;
    this.client = client;
  }

  public Order() {
  }

  public Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }

  public Date getMoment() {
    return moment;
  }

  public void setMoment(Date moment) {
    this.moment = moment;
  }

  public OrderStatus getStatus() {
    return status;
  }

  public void setStatus(OrderStatus status) {
    this.status = status;
  }

  public void addItem(OrderItem item) {
    orderItem.add(item);
  }

  public void removeItem(OrderItem item) {
    orderItem.remove(item);
  }

  public Double total() {
    double total = 0.00;
    for (OrderItem c : orderItem) {
      total += c.subTotal();
    }
    return total;
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("\n");
    sb.append("Order moment: ");
    sb.append(sdf.format(moment) + "\n");
    sb.append("Order status: ");
    sb.append(status + "\n");
    sb.append("Client: ");
    sb.append(client + "\n");
    sb.append("Order items: " + "\n");

    for (OrderItem c : orderItem) {
      sb.append(c + "\n");
    }

    sb.append("Total price: $");
    sb.append(String.format("%.2f", total()));

    return sb.toString();
  }

}
