# Assignment-5-Zoo
In this assignment you will design and implement a Java program to model a Zoo and its animals using inheritance and polymorphism. The base class will represent a generic animal, and four derived classes will represent specific animal types. You will also create a Zoo class to manage the collection of animals, demonstrating polymorphism through method overriding.

This assignment will reinforce your understanding of object-oriented programming principles such as inheritance, encapsulation, and polymorphism and the use of ArrayLists.

This assignment will be submitted on Canvas!

Requirements:
1. Base Class: Animal
You will create a base class to represent a generic animal. The base class must meet the following requirements:

Fields:

A private field to store the animal's name (String).
A private field to store the animal's species (String).
A private field to store the animal's age (int).
Constructor:

A public constructor that takes in three parameters; a String name, a String species and an int age, to initialize all the fields.
Getter Methods:

Provide three public methods that return the values of the fields. Names would be Get___ where ___ is the name of the field. These methods will have no parameters.
Abstract Method:

Define a public abstract method called GetDetails with no parameters and a return type of String that returns information about the animal. This method must be overridden by all derived classes to include additional details specific to each animal type.
2. Derived Classes
You will create four classes that extend the Animal base class: Lion, Elephant, Penguin, and Monkey. Each derived class must meet the following requirements:

Lion

Add a private field to store the length of the lion’s mane (in centimeters). Use double as the data type.
Define a constructor that initializes the lion’s name, age, and mane length.
Override the abstract method, GetDetails, from the base class to include information about the lion’s mane length in the output.
Elephant

Add a private field to store the length of the elephant’s trunk (in meters). Use double as the data type.
Define a constructor that initializes the elephant’s name, age, and trunk length.
Override the abstract method, GetDetails, from the base class to include information about the elephant’s trunk length in the output.
Penguin

Add a private field to store the penguin’s swimming speed (in kilometers per hour). Use double as the data type.
Define a constructor that initializes the penguin’s name, age, and swimming speed.
Override the abstract method, GetDetails, from the base class to include information about the penguin’s swimming speed in the output.
Monkey

Add a private field to store the monkey’s tail length (in centimeters). Use double as the data type.
Define a constructor that initializes the monkey’s name, age, and tail length.
Override the abstract method, GetDetails, from the base class to include information about the monkey’s tail length in the output.
Hint: Initialize the name, species and age of the derived classes using a super reference to connect to the base class's constructor. 
Hint: A hard coded String literal for the species can be used in this for each of the derived classes!
Hint: Use @Override to override GetDetails!

3. Zoo Class
Create a Zoo class to manage a collection of animals. The Zoo class must meet the following requirements:

Field:

Include a private field that stores a List of Animal objects. Use the ArrayList implementation of List.
Methods:

Implement a public method named AddAnimal to add an animal to the zoo. This method should accept an Animal object as a parameter and add it to the animals ArrayList.
Implement a public method named DisplayAllAnimals that iterates through the collection and calls the abstract method from the base class on each animal. This method should demonstrate polymorphic behavior by displaying specific details for each derived type without adjusting the call based on the animal's type.
Additional Requirements:
Encapsulation:
All fields must be private. Provide access only through getter methods.
Polymorphism:
Use the GetDetails() method to demonstrate polymorphic behavior.
Code Organization:
Each class should be implemented in its own .java file.
Style Guidelines
All fields must be _mixedCamelCase (e.g. _myVariable).
All methods must be UpperCamelCase (e.g. MyMethod).
Grading Breakdown:
Base Class Implementation:
Proper design of the Animal class and GetDetails method: 4pts
Derived Class Implementation:
Correct implementation of all four derived classes: 8pts
Zoo Class:
Correct implementation of AddAnimal and DisplayAllAnimals: 4pts
Polymorphism:
Proper use of method overriding and demonstration of polymorphic behavior: 2pts
Code Organization and Style:
Proper encapsulation, separation of files, and use of requested style guidelines: 2pts
Total: 20 
![image](https://github.com/user-attachments/assets/50cca002-1e0a-4a74-bfae-0a0f62159e9d)
Above is an example of a main method you can use to test your code to confirm if it works. Download the file here: [Main Class for TestingLinks](https://drive.google.com/file/d/18XuMb2hp9vEplFbcGGi-aQLfXPRhneoz/view?usp=sharing) to an external site. 

When running the above, your output should look something like this:

Name: Simba
Species: Lion
Age: 5
Mane Length: 25.0 cm

Name: Dumbo
Species: Elephant
Age: 10
Trunk Length: 2.5 meters

Name: Pingu
Species: Penguin
Age: 3
Swimming Speed: 10.0 km/h

Name: George
Species: Monkey
Age: 4
Tail Length: 75.0 cm

