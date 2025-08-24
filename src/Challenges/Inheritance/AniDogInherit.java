package Challenges.Inheritance;
class Animal {
    String name;
    String type;

    Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
    }
}

class Dog extends Animal {
    String breed;
    String color;

    Dog(String name, String type, String breed, String color) {
        super(name, type);
        this.breed = breed;
        this.color = color;
    }

    void display() {
        super.display();
        System.out.println("Breed: " + breed);
        System.out.println("Color: " + color);
    }
}

class Cat extends Animal {
    String breed;
    String color;

    Cat(String name, String type, String breed, String color) {
        super(name, type);
        this.breed = breed;
        this.color = color;
    }

    void display() {
        super.display();
        System.out.println("Breed: " + breed);
        System.out.println("Color: " + color);
    }
}

public class AniDogInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
