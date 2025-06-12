import java.util.ArrayList;

public class Zoo {
  private ArrayList<Animal> Animals = new ArrayList<>();

  public void AddAnimal(Animal animal) {
    Animals.add(animal);
  }

  public void DisplayAllAnimals() {
    for (Animal animal : Animals) {
      animal.GetDetails();
    }
  }
}

