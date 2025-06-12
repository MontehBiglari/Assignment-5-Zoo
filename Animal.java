public abstract class Animal {
    private String name;
    private String species;
    private int age;

    public Animal(String name, String species, int age) {
      this.name = name;
      this.species = species;
      this.age = age;
    }

    public String GetName() {
      return name;
    }

    public String GetSpecies() {
      return species;
    }

    public int GetAge() {
      return age;
    }

    public abstract String GetDetails();
}
    
