package Challenges.Abstraction;
abstract class Employee {
    abstract double calculateSalary();
    abstract double calculateBonus();
}

class Manager extends Employee {
    double base;
    Manager(double base) {
        this.base = base;
    }
    double calculateSalary() {
        return base + 20000;
    }
    double calculateBonus() {
        return base * 0.2;
    }
}

class Clerk extends Employee {
    double base;
    Clerk(double base) {
        this.base = base;
    }
    double calculateSalary() {
        return base + 5000;
    }
    double calculateBonus() {
        return base * 0.1;
    }
}
public class EmployeeAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
