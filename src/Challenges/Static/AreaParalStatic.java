package Challenges.Static;

import java.util.Scanner;

class AreaCa {
    static double parallelogramArea(double base, double height) {
        return base * height;
    }
}
public class AreaParalStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        double b = sc.nextDouble();

        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        System.out.println("Area of parallelogram is: " + AreaCa.parallelogramArea(b, h));
        sc.close();
	}

}
