package Challenges.Static;

import java.util.Scanner;

class AreaCal {
    static double squareArea(double side) {
        return side * side;
    }
}
public class areaSquStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter side: ");
        double s = sc.nextDouble();

        System.out.println("Area of square is: " + AreaCal.squareArea(s));
        sc.close();
	}

}
