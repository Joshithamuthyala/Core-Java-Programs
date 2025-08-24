package Challenges.Inheritance;
class Shape9 {
    String colour;
    String type;

    Shape9(String colour, String type) {
        this.colour = colour;
        this.type = type;
    }

    void display() {
        System.out.println("Colour: " + colour);
        System.out.println("Type: " + type);
    }
}

class Circle2 extends Shape9 {
    double radius;
    double area;

    Circle2(String colour, String type, double radius) {
        super(colour, type);
        this.radius = radius;
        this.area = Math.PI * radius * radius;
    }

    void display() {
        super.display();
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
    }
}

public class ShapCirInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
