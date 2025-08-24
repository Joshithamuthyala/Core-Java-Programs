package Challenges.Abstraction;
abstract class Animal {
    abstract void eat();
    abstract void sleep();
}

class Dog extends Animal {
    void eat() {
        System.out.println("Dog eats bones");
    }
    void sleep() {
        System.out.println("Dog sleeps in kennel");
    }
}

class Cat extends Animal {
    void eat() {
        System.out.println("Cat eats fish");
    }
    void sleep() {
        System.out.println("Cat sleeps on sofa");
    }
}
public class AnimalAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
