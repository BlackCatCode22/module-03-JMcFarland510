package myanimals;

public class Dog {
    String name;
    int age;
    String breed;
    String color;

    // Dog counter
    public static int numberOfDogs = 2;

    public static int getNumberOfDogs() {
        return numberOfDogs;
    }

    void bark() {
        System.out.println("Bark!");
    }

}
