package Challenges.Static;

import java.util.Scanner;

class ShapeOps {
    static double triangleArea(double base, double height) {
        return 0.5 * base * height;
    }
}
public class AreaTriStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        double b = sc.nextDouble();

        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        System.out.println("Area of triangle is: " + ShapeOps.triangleArea(b, h));

        sc.close();
	}

}
