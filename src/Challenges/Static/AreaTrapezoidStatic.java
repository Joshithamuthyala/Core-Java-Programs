package Challenges.Static;

import java.util.Scanner;

class Area {
    static double trapezoidArea(double base1, double base2, double height) {
        return ((base1 + base2) * height) / 2;
    }
}
public class AreaTrapezoidStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter base1: ");
        double b1 = sc.nextDouble();

        System.out.print("Enter base2: ");
        double b2 = sc.nextDouble();

        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        System.out.println("Area of trapezoid is: " + Area.trapezoidArea(b1, b2, h));
        sc.close();
	}

}
