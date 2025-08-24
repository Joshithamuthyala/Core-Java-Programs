package Challenges.Static;

import java.util.Scanner;

class AreaC {
    static double regularPolygonArea(int sides, double length) {
        return (sides * length * length) / (4 * Math.tan(Math.PI / sides));
    }
}
public class AreaRegularPolygonStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of sides: ");
        int n = sc.nextInt();

        System.out.print("Enter length of each side: ");
        double s = sc.nextDouble();

        System.out.println("Area of regular polygon is: " + AreaC.regularPolygonArea(n, s));

        sc.close();
	}

}
