package Challenges.EceptionHandling;

import java.util.Scanner;

public class AExcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter numerator: ");
        int a = sc.nextInt();

        System.out.print("Enter denominator: ");
        int b = sc.nextInt();

        try {
            int c = a / b;
            System.out.println("Result: " + c);
        } 
        catch (ArithmeticException e) {
            System.out.println("Exception Caught: " + e);
        }

        System.out.println("Program continues...");
        sc.close();
	}

}
