import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Animal {
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

    public abstract String GetDetails() {
      String details = String.format("Name: %s", this.name);
        details += String.format("Species: %s", this.species);
        details += String.format("Age: %d", this.age);
    }
    
