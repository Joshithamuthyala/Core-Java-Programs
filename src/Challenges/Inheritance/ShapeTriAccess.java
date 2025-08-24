package Challenges.Inheritance;
class Shapesu {
    String type;
    String color;

    Shapesu(String type, String color) {
        this.type = type;
        this.color = color;
    }

    void display() {
        System.out.println("Shape Type: " + type);
        System.out.println("Color: " + color);
    }
}

class Triangle extends Shapesu {
    double base;
    double height;

    Triangle(String type, String color, double base, double height) {
        super(type, color);
        this.base = base;
        this.height = height;
    }

    void display() {
        super.display();
        System.out.println("Base: " + base);
        System.out.println("Height: " + height);
        System.out.println("Area: " + (0.5 * base * height));
    }
}

public class ShapeTriAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapesu s = new Shapesu("Generic Shape", "Red");
        System.out.println("Shape Details:");
        s.display();

        System.out.println();

        Triangle t = new Triangle("Triangle", "Blue", 10, 6);
        System.out.println("Triangle Details:");
        t.display();
	}

}
