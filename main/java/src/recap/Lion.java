package recap;

import polymorphism.Animal;

public class Lion extends Animal{


  // Attribute
  private static final String SOUND = "roar";




  @Override
  public String getSound() {
    return SOUND;
  }
}
