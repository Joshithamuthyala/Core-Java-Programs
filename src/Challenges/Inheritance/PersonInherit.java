package Challenges.Inheritance;
class Persone {
    String name;
    int age;

    Persone(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Studente extends Persone {
    int rollNumber;

    Studente(String name, int age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }

    void display() {
        super.display();
        System.out.println("Roll Number: " + rollNumber);
    }
}

class Teachere extends Persone {
    String subject;

    Teachere(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void display() {
        super.display();
        System.out.println("Subject: " + subject);
    }
}

public class PersonInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
