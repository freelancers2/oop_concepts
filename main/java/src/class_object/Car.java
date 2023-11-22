package class_object;

public class Car {
private String craModelName;
private String colorName;
private long carId;
private double price;

  public Car(String craModelName, String colorName, long carId, double price) {
    this.craModelName = craModelName;
    this.colorName = colorName;
    this.carId = carId;
    this.price = price;
  }

  public String getCraModelName() {
    return craModelName;
  }

  public void setCraModelName(String craModelName) {
    this.craModelName = craModelName;
  }

  public String getColorName() {
    return colorName;
  }

  public void setColorName(String colorName) {
    this.colorName = colorName;
  }

  public long getCarId() {
    return carId;
  }

  public void setCarId(long carId) {
    this.carId = carId;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }


  @Override
  public String toString() {
    return "Wagon{" +
        "craModelName='" + craModelName + '\'' +
        ", colorName='" + colorName + '\'' +
        ", carId=" + carId +
        ", price=" + price +
        '}';
  }
}
