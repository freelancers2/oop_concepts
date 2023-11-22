package abtraction.abtract_class;

public abstract class Wagon {
    protected boolean turnedOn = false;


    // abstract methods

  public abstract void turnOn();
  public abstract String describe();

  // concrete methods
  public  double calculateSpeed(double distance,  int time){
        return distance / time;
  };

}
