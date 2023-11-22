package class_object;

public class Product {
  // Field
private String name;
private double price;

// Constructor
  public Product(String n, double p) {
    this.name = n;
    this.price = p;
  }

  public Product(){}

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "Product{" +
        "name='" + name + '\'' +
        ", price=" + price +
        '}';
  }
}
