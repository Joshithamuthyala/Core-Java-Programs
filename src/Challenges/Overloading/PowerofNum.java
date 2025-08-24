package Challenges.Overloading;

import java.util.Scanner;

public class PowerofNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        double base = sc.nextDouble();
        System.out.print("Enter exponent: ");
        double exp = sc.nextDouble();
        double result = 1;
        for(int i = 1; i <= exp; i++) {
            result *= base;
        }
        System.out.println("Result: " + result);
        sc.close();
	}

}
