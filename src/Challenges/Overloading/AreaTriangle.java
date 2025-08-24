package Challenges.Overloading;

import java.util.Scanner;

public class AreaTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        float base = sc.nextFloat();
        System.out.print("Enter height: ");
        float height = sc.nextFloat();
        float area = (base * height) / 2;
        System.out.println("Area of triangle: " + area);
        sc.close();
	}

}
