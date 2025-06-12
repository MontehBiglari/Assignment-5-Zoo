public class Lion extends Animal {
  private double maneLength;

  public Lion(String name, String species, int age, double maneLength) {
    super(name, species, age);
    this.maneLength = maneLength;
  }

  @Override
  String GetDetails() {
    String details = String.format("Name: %s\n", this.name);
    details += String.format("Species: %s\n", this.species);
    details += String.format("Age: %d\n", this.age);
    details += String.format("Mane Length: %f", this.maneLength);
  }
}
