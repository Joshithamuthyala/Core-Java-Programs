package Challenges.Overloading;

import java.util.Scanner;

public class MinofTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int min = (a < b) ? a : b;
        System.out.println("Minimum: " + min);
        sc.close();
	}

}
