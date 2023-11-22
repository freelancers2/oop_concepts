package recap;

import polymorphism.Animal;

public class Bird extends Animal {

  // Class Attributes
  private static final String SOUND = "Coco";


  @Override
  public String getSound() {
    return SOUND;
  }
}
