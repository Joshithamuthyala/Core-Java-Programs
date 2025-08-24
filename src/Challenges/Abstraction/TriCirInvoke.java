package Challenges.Abstraction;
abstract class Shapess {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Triangles extends Shapess {
    double a, b, c;
    Triangles(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    double calculateArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    double calculatePerimeter() {
        return a + b + c;
    }
}

class Circless extends Shapess {
    double r;
    Circless(double r) {
        this.r = r;
    }
    double calculateArea() {
        return Math.PI * r * r;
    }
    double calculatePerimeter() {
        return 2 * Math.PI * r;
    }
}

public class TriCirInvoke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Shapes t = new Triangle(3, 4, 5);
	        System.out.println("Triangle Area: " + t.calculateArea());
	        System.out.println("Triangle Perimeter: " + t.calculatePerimeter());

	        Shapes c = new Circles(7);
	        System.out.println("Circle Area: " + c.calculateArea());
	        System.out.println("Circle Perimeter: " + c.calculatePerimeter());
	}

}
