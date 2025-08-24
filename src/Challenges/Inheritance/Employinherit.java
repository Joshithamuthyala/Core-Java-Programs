package Challenges.Inheritance;
class Emplo{
    String name;
    int id;
    double salary;

    Emplo(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

class Managers extends Emplo{
    String department;
    String designation;

    Managers(String name, int id, double salary, String department, String designation) {
        super(name, id, salary);
        this.department = department;
        this.designation = designation;
    }

    void display() {
        super.display();
        System.out.println("Department: " + department);
        System.out.println("Designation: " + designation);
    }
}

public class Employinherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
