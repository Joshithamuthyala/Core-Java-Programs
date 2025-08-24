package Challenges.Inheritance;
class Person1 {
    String name;
    int age;

    Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employe extends Person1 {
    int id;
    double salary;

    Employe(String name, int age, int id, double salary) {
        super(name, age);
        this.id = id;
        this.salary = salary;
    }

    void display() {
        super.display();
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}
public class PersonEmpAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Person1 p = new Person1("Ramesh", 30);
	        System.out.println("Person Details:");
	        p.display();

	        System.out.println();

	        Employe e = new Employe("Suresh", 35, 101, 50000);
	        System.out.println("Employee Details:");
	        e.display();
	}

}
