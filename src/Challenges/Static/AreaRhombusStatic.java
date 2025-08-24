package Challenges.Static;

import java.util.Scanner;

class AreaCalcu {
    static double rhombusArea(double d1, double d2) {
        return (d1 * d2) / 2;
    }
}
public class AreaRhombusStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter first diagonal: ");
        double d1 = sc.nextDouble();

        System.out.print("Enter second diagonal: ");
        double d2 = sc.nextDouble();

        System.out.println("Area of rhombus is: " + AreaCalcu.rhombusArea(d1, d2));
        sc.close();
	}

}
