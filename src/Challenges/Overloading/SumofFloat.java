package Challenges.Overloading;

import java.util.Scanner;

public class SumofFloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float a = sc.nextFloat();
        System.out.print("Enter second number: ");
        float b = sc.nextFloat();
        float sum = a + b;
        System.out.println("Sum: " + sum);
        sc.close();
	}

}
