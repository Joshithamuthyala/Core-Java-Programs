package Challenges.Static;

import java.util.Scanner;

class MathO {
    static double squareRoot(double num) {
        return Math.sqrt(num);
    }
}
public class SquareStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double n = sc.nextDouble();

        System.out.println("Square root of " + n + " is: " + MathO.squareRoot(n));

        sc.close();
	}

}
