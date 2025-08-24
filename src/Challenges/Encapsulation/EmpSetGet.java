package Challenges.Encapsulation;

import java.util.Scanner;

class Employ {
    private String name;
    private int id;
    private double salary;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary");
        }
    }
}
public class EmpSetGet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        Employ emp = new Employ();

        System.out.print("Enter employee name: ");
        emp.setName(sc.nextLine());

        System.out.print("Enter employee ID: ");
        emp.setId(sc.nextInt());

        System.out.print("Enter salary: ");
        emp.setSalary(sc.nextDouble());

        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + emp.getName());
        System.out.println("ID: " + emp.getId());
        System.out.println("Salary: " + emp.getSalary());
        sc.close();
	}

}
