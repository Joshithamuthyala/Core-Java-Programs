package Challenges.Overloading;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double n = sc.nextDouble();
        double sqrt = Math.sqrt(n);
        System.out.println("Square root: " + sqrt);
        sc.close();
	}

}
