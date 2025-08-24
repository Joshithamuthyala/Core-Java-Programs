package Challenges.Encapsulation;
class Stu {
    private String name;
    private int rollNumber;
    private double marks;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public double getMarks() {
        return marks;
    }
    public void setMarks(double marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks");
        }
    }
}
public class StudentEncap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
