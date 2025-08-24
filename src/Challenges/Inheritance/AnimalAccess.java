package Challenges.Inheritance;
class Anima {
    String name;
    int age;

    Anima(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Doggy extends Anima {
    String breed;
    String color;

    Doggy(String name, int age, String breed, String color) {
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

class Caty extends Anima {
    String breed;
    String color;

    Caty(String name, int age, String breed, String color) {
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
public class AnimalAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doggy d = new Doggy("Buddy", 3, "Labrador", "Golden");
        System.out.println("Dog Details:");
        d.display();

        System.out.println();

        Caty c = new Caty("Kitty", 2, "Persian", "White");
        System.out.println("Cat Details:");
        c.display();
	}

}
