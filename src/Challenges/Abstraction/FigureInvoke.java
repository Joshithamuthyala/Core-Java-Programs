package Challenges.Abstraction;
abstract class Figure {
    abstract void draw();
    abstract void erase();
}

class Rectangl extends Figure {
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
    void erase() {
        System.out.println("Erasing a Rectangle");
    }
}

class Circl extends Figure {
    void draw() {
        System.out.println("Drawing a Circle");
    }
    void erase() {
        System.out.println("Erasing a Circle");
    }
}
public class FigureInvoke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Figure f1 = new Rectangl();
	        f1.draw();
	        f1.erase();

	        Figure f2 = new Circl();
	        f2.draw();
	        f2.erase();
	}

}
