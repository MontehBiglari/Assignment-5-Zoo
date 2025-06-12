import java.util.ArrayList
import java.util.List

public class Zoo {
  private ArrayList<Animal> Animals = new ArrayList<>();

  public AddAnimal(Animal animal) {
    Animals.add(animal);
  }

  public DisplayAllAnimals {
    for (Animal animal : Animals) {
      animal.GetDetails();
    }
  }
}
