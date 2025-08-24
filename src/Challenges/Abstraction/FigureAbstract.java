package Challenges.Abstraction;
abstract class Figureo {
    abstract void draw();
    abstract void erase();
}

class Rectangleo extends Figureo {
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
    void erase() {
        System.out.println("Erasing a Rectangle");
    }
}

class Circleo extends Figureo {
    void draw() {
        System.out.println("Drawing a Circle");
    }
    void erase() {
        System.out.println("Erasing a Circle");
    }
}
public class FigureAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
