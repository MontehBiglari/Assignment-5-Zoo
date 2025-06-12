
public class main {
    public static void main(String[] args) {
        //Creating a zoo
        Zoo myZoo = new Zoo();

        //Adding animals to the zoo
        myZoo.AddAnimal(new Lion("Simba", "Lion", 5, 25.0));
        myZoo.AddAnimal(new Elephant("Dumbo", "Elephant", 10, 2.5));
        myZoo.AddAnimal(new Penguin("Pingu", "Penguin", 3, 10.0));
        myZoo.AddAnimal(new Monkey("George", "Monkey", 4, 75.0));

        //Displaying all of the animal information
        myZoo.DisplayAllAnimals();
    }
}

