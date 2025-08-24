package Challenges.Overloading;

import java.util.Scanner;

public class AreaPolygon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of sides: ");
        int n = sc.nextInt();
        System.out.print("Enter length of side: ");
        double s = sc.nextDouble();
        double area = (n * s * s) / (4 * Math.tan(Math.PI / n));
        System.out.println("Area of regular polygon: " + area);
        sc.close();
	}

}
