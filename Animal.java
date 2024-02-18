package myanimals;

public class Animal {
    public static void main(String[] args) {

        // Dog object 1

Dog myDog = new Dog();
myDog.name = "Osiris";
myDog.age = 14;
myDog.breed = "American Pitbull Terrier";
myDog.color = "Tan";

System.out.println("My dog's name is: " + myDog.name);
System.out.println("My dog's age is: " + myDog.age);
System.out.println("My dog's breed is: " + myDog.breed);
System.out.println("My dog's color is: " + myDog.color);

        // Bark method

myDog.bark();

       // Dog object 2

Dog yourDog = new Dog();
yourDog.name = "Devana";
yourDog.age = 1;
yourDog.breed = "Doberman";
yourDog.color = "Black and Tan";

System.out.println("Your dog's name is: " + yourDog.name);
System.out.println("Your dog's age is: " + yourDog.age);
System.out.println("Your dog's breed is: " + yourDog.breed);
System.out.println("Your dog's color is: " + yourDog.color);

      // Bark method

yourDog.bark();

        // Cat object 1

Cat myCat = new Cat();
myCat.name = "Nibbles";
myCat.age = 18;
myCat.breed = "Tabby";
myCat.color = "Black";

System.out.println("My cat's name is: " + myCat.name);
System.out.println("My cat's age is: " + myCat.age);
System.out.println("My cat's breed is: " + myCat.breed);
System.out.println("My cat's color is: " + myCat.color);

        // Meow method

myCat.meow();

        // Cat object 2

Cat yourCat = new Cat();

yourCat.name = "Hunter";
yourCat.age = 17;
yourCat.breed = "Maine coon";
yourCat.color = "White";

System.out.println("Your cat's name is: " + yourCat.name);
System.out.println("Your cat's age is: " + yourCat.age);
System.out.println("Your cat's breed is: " + yourCat.breed);
System.out.println("Your cat's color is: " + yourCat.color);

        // Meow method

        myCat.meow();

        // Dog and cat counter output

        System.out.println("Number of cats: " + Cat.getNumberOfCats());
        System.out.println("Number of dogs: " + Dog.getNumberOfDogs());

        }
    }