package org.example.ordermanagement;

public class Order {
    private String id;
    private String item;
    private int quantity;
    private double price;

    public Order(String id, String item, int quantity, double price) {
        this.id = id;
        this.item = item;
        this.quantity = quantity;
        this.price = price;
    }

    public double getTotalPrice() {
        return quantity * price;
    }

    // Getters and Setters
    public String getId() { return id; }
    public String getItem() { return item; }
    public int getQuantity() { return quantity; }
    public double getPrice() { return price; }
    public void setId(String id) { this.id = id; }
    public void setItem(String item) { this.item = item; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public void setPrice(double price) { this.price = price; }

}
