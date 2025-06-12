public class Elephant extends Animal {
    private double trunkLength;

    public Lion(String name, String species, int age, double trunkLength) {
        super(name, species, age);
        this.trunkLength = trunkLength;
    }

    @Override
    public String getDetails() {
        String details = String.format("Name: %s%n", GetName());
        details += String.format("Species: %s%n", GetSpecies());
        details += String.format("Age: %d%n", GetAge());
        details += String.format("Trunk Length: %f m", trunkLength);
        return details;
    }
}
