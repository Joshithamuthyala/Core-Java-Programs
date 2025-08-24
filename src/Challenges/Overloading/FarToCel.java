package Challenges.Overloading;

import java.util.Scanner;

public class FarToCel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double f = sc.nextDouble();
        double c = (f - 32) * 5 / 9;
        System.out.println("Temperature in Celsius: " + c);
        sc.close();
	}

}
