package Challenges.Overloading;

import java.util.Scanner;

public class CelToFar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double c = sc.nextDouble();
        double f = (c * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + f);
        sc.close();
	}

}
