package Challenges.Inheritance;
class Shaped {
    String type;
    String color;

    Shaped(String type, String color) {
        this.type = type;
        this.color = color;
    }

    void display() {
        System.out.println("Shape Type: " + type);
        System.out.println("Color: " + color);
    }
}

class Triangl extends Shaped {
    double base;
    double height;

    Triangl(String type, String color, double base, double height) {
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

public class ShapeTriInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
