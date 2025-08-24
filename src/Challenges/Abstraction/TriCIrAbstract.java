package Challenges.Abstraction;
abstract class Shapes {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Triangle extends Shapes {
    double a, b, c;
    Triangle(double a, double b, double c) {
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

class Circles extends Shapes {
    double r;
    Circles(double r) {
        this.r = r;
    }
    double calculateArea() {
        return Math.PI * r * r;
    }
    double calculatePerimeter() {
        return 2 * Math.PI * r;
    }
}
public class TriCIrAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
