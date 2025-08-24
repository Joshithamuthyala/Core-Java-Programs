package Challenges.Datatypes;

import java.util.Scanner;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
public class USEARRay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            String name = sc.nextLine();
            System.out.print("Enter age of student " + (i + 1) + ": ");
            int age = sc.nextInt();
            sc.nextLine();
            students[i] = new Student(name, age);
        }

        System.out.println("\nStudent Details:");
        for (Student s : students) {
            s.display();
        }
        sc.close();
	}

}
