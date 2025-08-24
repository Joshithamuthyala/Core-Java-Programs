package Challenges.Interface;
interface Flyabl {
    void fly();
}

interface Swimabl {
    void swim();
}

class Birds implements Flyabl {
    private String name;

    public Birds(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying.");
    }
}

class Fishu implements Swimabl {
    private String name;

    public Fishu(String name) {
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming.");
    }
}
public class FlySwimAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Birds eagle = new Birds("Eagle");
	        Fishu salmon = new Fishu("Salmon");

	        eagle.fly();
	        salmon.swim();
	}

}
