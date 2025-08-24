package Challenges.Interface;
interface Flyable {
    void fly();
}

interface Swimable {
    void swim();
}

class Bird implements Flyable {
    private String name;

    public Bird(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying.");
    }
}

class Fish implements Swimable {
    private String name;

    public Fish(String name) {
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming.");
    }
}
public class FlySwim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
