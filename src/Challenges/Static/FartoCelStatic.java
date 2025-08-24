package Challenges.Static;

import java.util.Scanner;

class TempConver {
    static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
}
public class FartoCelStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter temperature in Fahrenheit: ");
	        double f = sc.nextDouble();

	        System.out.println("Temperature in Celsius: " + TempConver.fahrenheitToCelsius(f));

	        sc.close();
	}

}
