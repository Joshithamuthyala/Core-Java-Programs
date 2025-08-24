package Challenges.Inheritance;
class Shape2 {
    String colour;
    String type;

    Shape2(String colour, String type) {
        this.colour = colour;
        this.type = type;
    }

    void display() {
        System.out.println("Colour: " + colour);
        System.out.println("Type: " + type);
    }
}

class Circle1 extends Shape2 {
    double radius;
    double area;

    Circle1(String colour, String type, double radius) {
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

public class ShapCirAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape2 s = new Shape2("Yellow", "Generic Shape");
        System.out.println("Shape Details:");
        s.display();

        System.out.println();

        Circle1 c = new Circle1("Red", "Circle", 7);
        System.out.println("Circle Details:");
        c.display();
	}

}
