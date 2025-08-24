package Challenges.Inheritance;
class Person0 {
    String name;
    int age;

    Person0(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employ extends Person0 {
    int id;
    double salary;

    Employ(String name, int age, int id, double salary) {
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
public class PersonEmpInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
