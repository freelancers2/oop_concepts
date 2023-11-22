package abtraction.abtract_class;

public class Car extends Wagon {


  @Override
  public void turnOn() {
    this.turnedOn = true;
  }

  @Override
  public String describe() {
    return "this is a car wagon, and it has four wheels, and a diesel engin";
  }
}
