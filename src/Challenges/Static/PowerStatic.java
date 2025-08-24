package Challenges.Static;

import java.util.Scanner;

class MathOp {
    static double power(double base, double exp) {
        double result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        return result;
    }
}
public class PowerStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter base: ");
	        double base = sc.nextDouble();

	        System.out.print("Enter exponent: ");
	        int exp = sc.nextInt();

	        System.out.println(base + " raised to " + exp + " is: " + MathOp.power(base, exp));

	        sc.close();
	}

}
