public class Monkey extends Animal {
    private double tailLength;

    public Monkey(String name, String species, int age, double tailLength) {
        super(name, species, age);
        this.tailLength = tailLength;
    }

    @Override
    public String GetDetails() {
        String details = String.format("Name: %s%n", GetName());
        details += String.format("Species: %s%n", GetSpecies());
        details += String.format("Age: %d%n", GetAge());
        details += String.format("Tail Length: %f cm", tailLength);
        return details;
    }
}
