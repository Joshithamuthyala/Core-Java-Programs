package Challenges.Abstraction;
abstract class Shape {
    abstract double area();
    abstract double perimeter();
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

class Rectangle extends Shape {
    double l, w;
    Rectangle(double l, double w) {
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
public class ShapeArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
