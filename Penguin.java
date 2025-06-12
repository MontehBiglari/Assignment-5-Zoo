public class Penguin extends Animal {
    private double swimmingSpeed;
    

    public Penguin(String name, String species, int age, double swimmingSpeed) {
        super(name, species, age);
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public String GetDetails() {
        String details = String.format("Name: %s%n", GetName());
        details += String.format("Species: %s%n", GetSpecies());
        details += String.format("Age: %d%n", GetAge());
        details += String.format("Swimming Speed: %f km/h", swimmingSpeed);
        return details;
    }
}
