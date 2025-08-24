package Challenges.Inheritance;
class Animal2 {
    String name;
    String type;

    Animal2(String name, String type) {
        this.name = name;
        this.type = type;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
    }
}

class Bird extends Animal2 {
    String color;
    double wingspan;

    Bird(String name, String type, String color, double wingspan) {
        super(name, type);
        this.color = color;
        this.wingspan = wingspan;
    }

    void display() {
        super.display();
        System.out.println("Color: " + color);
        System.out.println("Wingspan: " + wingspan + " meters");
    }
}

public class AniBirdAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Animal2 a = new Animal2("Generic Animal", "Mammal");
	        System.out.println("Animal Details:");
	        a.display();

	        System.out.println();

	        Bird b = new Bird("Parrot", "Bird", "Green", 0.25);
	        System.out.println("Bird Details:");
	        b.display();
	}

}
