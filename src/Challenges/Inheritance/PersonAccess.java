package Challenges.Inheritance;
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    int rollNumber;

    Student(String name, int age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }

    void display() {
        super.display();
        System.out.println("Roll Number: " + rollNumber);
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void display() {
        super.display();
        System.out.println("Subject: " + subject);
    }
}

public class PersonAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Student s = new Student("Rahul", 20, 101);
	        System.out.println("Student Details:");
	        s.display();

	        System.out.println();

	        Teacher t = new Teacher("Mr. Sharma", 40, "Mathematics");
	        System.out.println("Teacher Details:");
	        t.display();
	}

}
