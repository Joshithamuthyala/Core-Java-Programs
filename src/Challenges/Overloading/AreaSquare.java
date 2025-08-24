package Challenges.Overloading;

import java.util.Scanner;

public class AreaSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter side length: ");
        double side = sc.nextDouble();
        double area = side * side;
        System.out.println("Area of square: " + area);
        sc.close();
	}

}
