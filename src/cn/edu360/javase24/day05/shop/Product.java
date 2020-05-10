package cn.edu360.javase24.day05.shop;

public class Product {

    private String productId;
    private String productName;
    private float price;
    private int quantity;

    public Product() {

    }

    public Product(String productId, String productName, float price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public float getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String toString() {
        return this.productId + ", " + this.productName + ", " + this.price + ", " + this.quantity;
    }
}
