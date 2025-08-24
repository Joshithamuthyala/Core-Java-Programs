package Challenges.Encapsulation;

import java.util.Scanner;

class Studen {
    private String name;
    private int roll;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
public class PrivatMemberPublicAccMe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        Studen s = new Studen();
        System.out.print("Enter name: ");
        s.setName(sc.nextLine());
        System.out.print("Enter roll number: ");
        s.setRoll(sc.nextInt());
        System.out.print("Enter age: ");
        s.setAge(sc.nextInt());
        System.out.println("\nStudent Details (Using Encapsulation):");
        System.out.println("Name: " + s.getName());
        System.out.println("Roll: " + s.getRoll());
        System.out.println("Age: " + s.getAge());
        sc.close();
	}

}
