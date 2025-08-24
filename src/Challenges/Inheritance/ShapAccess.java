package Challenges.Inheritance;
class Shape {
    double area() {
        return 0;
    }
    double perimeter() {
        return 0;
    }
}

class Circle extends Shape {
    double r;
    Circle(double r) {
        this.r = r;
    }
    double area() {
        return Math.PI * r * r;
    }
    double perimeter() {
        return 2 * Math.PI * r;
    }
}

class Rect extends Shape {
    double l, w;
    Rect(double l, double w) {
        this.l = l;
        this.w = w;
    }
    double area() {
        return l * w;
    }
    double perimeter() {
        return 2 * (l + w);
    }
}

public class ShapAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Shape c = new Circle(5);
	        System.out.println("Circle Area: " + c.area());
	        System.out.println("Circle Perimeter: " + c.perimeter());

	        Shape r = new Rect(4, 6);
	        System.out.println("Rectangle Area: " + r.area());
	        System.out.println("Rectangle Perimeter: " + r.perimeter());
	}

}
