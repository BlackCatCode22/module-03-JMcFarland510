package myanimals;

public class Cat {
    String name;
    int age;
    String breed;
    String color;

    // Cat counter

    public static int numberOfCats = 2;

    public static int getNumberOfCats() {
        return numberOfCats;
    }

    void meow() {
        System.out.println("Meow!");
    }

}
