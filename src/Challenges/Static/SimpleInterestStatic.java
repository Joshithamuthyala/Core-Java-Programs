package Challenges.Static;

import java.util.Scanner;

class InterestCalc {
    static double simpleInterest(double p, double r, double t) {
        return (p * r * t) / 100;
    }
}

public class SimpleInterestStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal: ");
        double p = sc.nextDouble();

        System.out.print("Enter rate of interest: ");
        double r = sc.nextDouble();

        System.out.print("Enter time (in years): ");
        double t = sc.nextDouble();

        System.out.println("Simple Interest is: " + InterestCalc.simpleInterest(p, r, t));

        sc.close();
	}

}
