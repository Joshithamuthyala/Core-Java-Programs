package Challenges.Overloading;

import java.util.Scanner;

public class AreaTrapezoid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter base 1: ");
        double b1 = sc.nextDouble();
        System.out.print("Enter base 2: ");
        double b2 = sc.nextDouble();
        System.out.print("Enter height: ");
        double h = sc.nextDouble();
        double area = ((b1 + b2) / 2) * h;
        System.out.println("Area of trapezoid: " + area);
        sc.close();
	}

}
