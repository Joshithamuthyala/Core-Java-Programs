package Challenges.Inheritance;
class Shapeu2 {
    String colour;
    String type;

    Shapeu2(String colour, String type) {
        this.colour = colour;
        this.type = type;
    }

    void display() {
        System.out.println("Colour: " + colour);
        System.out.println("Type: " + type);
    }
}

class Rectangle2 extends Shapeu2 {
    double length;
    double width;

    Rectangle2(String colour, String type, double length, double width) {
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
public class ShapRectAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapeu2 s = new Shapeu2("Red", "Generic Shape");
        System.out.println("Shape Details:");
        s.display();

        System.out.println();

        Rectangle2 r = new Rectangle2("Blue", "Rectangle", 10, 5);
        System.out.println("Rectangle Details:");
        r.display();
	}

}
