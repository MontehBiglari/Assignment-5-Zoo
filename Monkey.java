public class Monkey extends Animal {
    private double tailLength;

    public Lion(String name, String species, int age, double tailLength) {
        super(name, species, age);
        this.tailLength = tailLength;
    }

    @Override
    public String getDetails() {
        String details = String.format("Name: %s%n", getName());
        details += String.format("Species: %s%n", getSpecies());
        details += String.format("Age: %d%n", getAge());
        details += String.format("Tail Length: %f cm", tailLength);
        return details;
    }
}
