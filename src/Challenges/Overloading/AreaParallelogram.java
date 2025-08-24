package Challenges.Overloading;

import java.util.Scanner;

public class AreaParallelogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        double base = sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();
        double area = base * height;
        System.out.println("Area of parallelogram: " + area);
        sc.close();
	}

}
