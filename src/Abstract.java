// Abstract class
abstract class Animall {
  // Abstract method (does not have a body)
  public abstract void animalSound();
  // Regular method
  public void sleep() {
    System.out.println("Zzz");
  }
}

// Subclass (inherit from Animal)
class Pigg extends Animall {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee weeeeeeeeeeeee");
  }
}

class Main {
  public static void main(String[] args) {
    Pigg mPig = new Pigg(); // Create a Pig object
    mPig.animalSound();
    mPig.sleep();
  }
}