package Challenges.Overloading;

import java.util.Scanner;

public class AverageofThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        System.out.print("Enter third number: ");
        double c = sc.nextDouble();
        double avg = (a + b + c) / 3;
        System.out.println("Average: " + avg);
        sc.close();
	}

}
