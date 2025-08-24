package Challenges.Encapsulation;
class Employee {
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
public class EmpEncap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
