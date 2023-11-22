package abtraction.interfaces_in_java;

public interface Electronic {
// Constant attribute
  String LED = "LED";

  // Abstract methods
  public int getElectricityUsed();

  // non-abstract methods :
  // Static method
  public static boolean isEnergyEfficient(String electronicType){
    if(electronicType.equals(LED)){
      return true;
    }

    return false;
  }

  // private, default  methods
   default void  printDescription(){
     System.out.println("Electronic Description");
   }

}
