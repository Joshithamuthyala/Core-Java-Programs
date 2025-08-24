package Challenges.Inheritance;
class Animal1 {
    String name;
    String type;

    Animal1(String name, String type) {
        this.name = name;
        this.type = type;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
    }
}

class Dogg extends Animal1 {
    String breed;
    String color;

    Dogg(String name, String type, String breed, String color) {
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

class Catt extends Animal1 {
    String breed;
    String color;

    Catt(String name, String type, String breed, String color) {
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

public class AniDogAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal1 a = new Animal1("Generic Animal", "Mammal");
        System.out.println("Animal Details:");
        a.display();

        System.out.println();

        Dogg d = new Dogg("Buddy", "Dog", "Labrador", "Golden");
        System.out.println("Dog Details:");
        d.display();

        System.out.println();

        Catt c = new Catt("Kitty", "Cat", "Persian", "White");
        System.out.println("Cat Details:");
        c.display();
	}

}
