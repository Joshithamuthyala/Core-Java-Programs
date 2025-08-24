package Challenges.Static;

import java.util.Scanner;

class InterestCal {
    static double compoundInterest(double p, double r, double t) {
        return p * Math.pow((1 + r / 100), t) - p;
    }
}
public class CompoundedInterestStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal: ");
        double p = sc.nextDouble();

        System.out.print("Enter rate of interest: ");
        double r = sc.nextDouble();

        System.out.print("Enter time (in years): ");
        double t = sc.nextDouble();

        System.out.println("Compound Interest is: " + InterestCal.compoundInterest(p, r, t));
        sc.close();
	}

}
