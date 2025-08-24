package Challenges.Encapsulation;

import java.util.Scanner;

class Stud {
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
public class StudentSetGet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        Stud student = new Stud();

        System.out.print("Enter student name: ");
        student.setName(sc.nextLine());

        System.out.print("Enter roll number: ");
        student.setRollNumber(sc.nextInt());

        System.out.print("Enter marks: ");
        student.setMarks(sc.nextDouble());

        System.out.println("\nStudent Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("Roll Number: " + student.getRollNumber());
        System.out.println("Marks: " + student.getMarks());

        sc.close();
	}

}
