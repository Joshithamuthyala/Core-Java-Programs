package Challenges.Inheritance;
class Fruit {
    String name;
    String color;

    Fruit(String name, String color) {
        this.name = name;
        this.color = color;
    }

    void display() {
        System.out.println("Fruit Name: " + name);
        System.out.println("Color: " + color);
    }
}

class Apple extends Fruit {
    String taste;
    String size;

    Apple(String name, String color, String taste, String size) {
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

class Banana extends Fruit {
    String taste;
    String size;

    Banana(String name, String color, String taste, String size) {
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

public class FruitAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit f = new Fruit("Generic Fruit", "Green");
        System.out.println("Fruit Details:");
        f.display();

        System.out.println("--------------");

        Apple a = new Apple("Apple", "Red", "Sweet", "Medium");
        System.out.println("Apple Details:");
        a.display();

        System.out.println("-------------");

        Banana b = new Banana("Banana", "Yellow", "Sweet", "Large");
        System.out.println("Banana Details:");
        b.display();
	}

}
