package Challenges.Static;

import java.util.Scanner;

class TempConvert {
    static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
}
public class CEltoFarStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double c = sc.nextDouble();

        System.out.println("Temperature in Fahrenheit: " + TempConvert.celsiusToFahrenheit(c));

        sc.close();
	}

}
