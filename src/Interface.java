// Interface
interface Ani {
  public void animalSound(); // interface method (does not have a body)
  public void sleep(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
class Bird implements Ani {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The bird says: wee wee");
  }
  public void sleep() {
    // The body of sleep() is provided here
    System.out.println("Zzz");
  }

  public static void main(String[] args) {
    Bird myB = new Bird();  // Create a Pig object
    myB.animalSound();
    myB.sleep();
  }
} 