package Challenges.Overloading;

import java.util.Scanner;

public class CompoundInterst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal: ");
        double p = sc.nextDouble();
        System.out.print("Enter rate of interest: ");
        double r = sc.nextDouble();
        System.out.print("Enter time (in years): ");
        double t = sc.nextDouble();
        System.out.print("Enter number of times interest is compounded per year: ");
        int n = sc.nextInt();
        double amount = p * Math.pow((1 + r / (n * 100)), n * t);
        double ci = amount - p;
        System.out.println("Compound Interest: " + ci);
        sc.close();
	}

}
