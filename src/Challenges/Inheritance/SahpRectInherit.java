package Challenges.Inheritance;
class Shape1 {
    String colour;
    String type;

    Shape1(String colour, String type) {
        this.colour = colour;
        this.type = type;
    }

    void display() {
        System.out.println("Colour: " + colour);
        System.out.println("Type: " + type);
    }
}

class Rectangle1 extends Shape1 {
    double length;
    double width;

    Rectangle1(String colour, String type, double length, double width) {
        super(colour, type);
        this.length = length;
        this.width = width;
    }

    void display() {
        super.display();
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + (length * width));
        System.out.println("Perimeter: " + (2 * (length + width)));
    }
}
public class SahpRectInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
