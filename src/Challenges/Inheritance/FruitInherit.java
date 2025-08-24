package Challenges.Inheritance;
class Fruits {
    String name;
    String color;

    Fruits(String name, String color) {
        this.name = name;
        this.color = color;
    }

    void display() {
        System.out.println("Fruit Name: " + name);
        System.out.println("Color: " + color);
    }
}

class Apples extends Fruits {
    String taste;
    String size;

    Apples(String name, String color, String taste, String size) {
        super(name, color);
        this.taste = taste;
        this.size = size;
    }

    void display() {
        super.display();
        System.out.println("Taste: " + taste);
        System.out.println("Size: " + size);
    }
}

class Bananas extends Fruits {
    String taste;
    String size;

    Bananas(String name, String color, String taste, String size) {
        super(name, color);
        this.taste = taste;
        this.size = size;
    }

    void display() {
        super.display();
        System.out.println("Taste: " + taste);
        System.out.println("Size: " + size);
    }
}

public class FruitInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
