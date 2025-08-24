package Challenges.Inheritance;
class Animal3 {
    String name;
    String type;

    Animal3(String name, String type) {
        this.name = name;
        this.type = type;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
    }
}

class Birds extends Animal3 {
    String color;
    double wingspan;

    Birds(String name, String type, String color, double wingspan) {
        super(name, type);
        this.color = color;
        this.wingspan = wingspan;
    }

    void display() {
        super.display();
        System.out.println("Color: " + color);
        System.out.println("Wingspan: " + wingspan + " meters");
    }
}

public class AniBirdInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
