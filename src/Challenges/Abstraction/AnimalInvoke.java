package Challenges.Abstraction;
abstract class Animalo {
    abstract void eat();
    abstract void sleep();
}

class Dogo extends Animalo {
    void eat() {
        System.out.println("Dog eats bones");
    }
    void sleep() {
        System.out.println("Dog sleeps in kennel");
    }
}

class Cato extends Animalo {
    void eat() {
        System.out.println("Cat eats fish");
    }
    void sleep() {
        System.out.println("Cat sleeps on sofa");
    }
}
public class AnimalInvoke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Animalo d = new Dogo();
	        d.eat();
	        d.sleep();

	        Animalo c = new Cato();
	        c.eat();
	        c.sleep();
	}

}
