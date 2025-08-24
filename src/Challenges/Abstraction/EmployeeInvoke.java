package Challenges.Abstraction;
abstract class Employeeo {
    abstract double calculateSalary();
    abstract double calculateBonus();
}

class Managero extends Employeeo {
    double base;
    Managero(double base) {
        this.base = base;
    }
    double calculateSalary() {
        return base + 20000;
    }
    double calculateBonus() {
        return base * 0.2;
    }
}

class Clerko extends Employeeo {
    double base;
    Clerko(double base) {
        this.base = base;
    }
    double calculateSalary() {
        return base + 5000;
    }
    double calculateBonus() {
        return base * 0.1;
    }
}
public class EmployeeInvoke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employeeo m = new Managero(40000);
        System.out.println("Manager Salary: " + m.calculateSalary());
        System.out.println("Manager Bonus: " + m.calculateBonus());

        Employeeo c = new Clerko(20000);
        System.out.println("Clerk Salary: " + c.calculateSalary());
        System.out.println("Clerk Bonus: " + c.calculateBonus());
	}

}
