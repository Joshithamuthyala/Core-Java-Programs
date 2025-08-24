package Challenges.Inheritance;
class Shapeo {
    double area() {
        return 0;
    }
    double perimeter() {
        return 0;
    }
}

class Circl extends Shapeo {
    double r;
    Circl(double r) {
        this.r = r;
    }
    double area() {
        return Math.PI * r * r;
    }
    double perimeter() {
        return 2 * Math.PI * r;
    }
}

class Recto extends Shapeo {
    double l, w;
    Recto(double l, double w) {
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

public class Shapeclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
	}

}
