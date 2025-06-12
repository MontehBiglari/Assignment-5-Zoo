public class Lion extends Animal {
    private double maneLength;

    public Lion(String name, String species, int age, double maneLength) {
        super(name, species, age);
        this.maneLength = maneLength;
    }

    @Override
    public String getDetails() {
        String details = String.format("Name: %s%n", GetName());
        details += String.format("Species: %s%n", GetSpecies());
        details += String.format("Age: %d%n", GetAge());
        details += String.format("Mane Length: %f", maneLength);
        return details;
    }
}
