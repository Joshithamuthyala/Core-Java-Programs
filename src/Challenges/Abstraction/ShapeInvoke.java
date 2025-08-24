package Challenges.Abstraction;
abstract class Shape3 {
    abstract double area();
    abstract double perimeter();
}

class Circlee extends Shape3 {
    double r;
    Circlee(double r) {
        this.r = r;
    }
    double area() {
        return Math.PI * r * r;
    }
    double perimeter() {
        return 2 * Math.PI * r;
    }
}

class Rectanglee extends Shape3 {
    double l, w;
    Rectanglee(double l, double w) {
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
public class ShapeInvoke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape3 c = new Circlee(5);
        System.out.println("Circle Area: " + c.area());
        System.out.println("Circle Perimeter: " + c.perimeter());

        Shape3 r = new Rectanglee(4, 6);
        System.out.println("Rectangle Area: " + r.area());
        System.out.println("Rectangle Perimeter: " + r.perimeter());
	}

}
