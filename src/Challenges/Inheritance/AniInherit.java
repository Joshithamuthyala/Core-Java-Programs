package Challenges.Inheritance;
class Animals {
    String name;
    int age;

    Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Dogo extends Animals {
    String breed;
    String color;

    Dogo(String name, int age, String breed, String color) {
        super(name, age);
        this.breed = breed;
        this.color = color;
    }

    void display() {
        super.display();
        System.out.println("Breed: " + breed);
        System.out.println("Color: " + color);
    }
}

class Cato extends Animals {
    String breed;
    String color;

    Cato(String name, int age, String breed, String color) {
        super(name, age);
        this.breed = breed;
        this.color = color;
    }

    void display() {
        super.display();
        System.out.println("Breed: " + breed);
        System.out.println("Color: " + color);
    }
}
public class AniInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
