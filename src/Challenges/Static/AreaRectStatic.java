package Challenges.Static;

import java.util.Scanner;

class AreaCalc {
    static double rectangleArea(double length, double width) {
        return length * width;
    }
}
public class AreaRectStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double l = sc.nextDouble();

        System.out.print("Enter width: ");
        double w = sc.nextDouble();

        System.out.println("Area of rectangle is: " + AreaCalc.rectangleArea(l, w));

        sc.close();
	}

}
