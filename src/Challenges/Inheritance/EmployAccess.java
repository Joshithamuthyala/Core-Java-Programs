package Challenges.Inheritance;
class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
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

class Manager extends Employee {
    String department;
    String designation;

    Manager(String name, int id, double salary, String department, String designation) {
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

public class EmployAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee("Alice", 101, 45000);
        System.out.println("Employee Details:");
        e.display();

        System.out.println();

        Manager m = new Manager("Bob", 102, 75000, "IT", "Project Manager");
        System.out.println("Manager Details:");
        m.display();
	}

}
