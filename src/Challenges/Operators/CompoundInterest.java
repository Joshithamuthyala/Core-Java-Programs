package Challenges.Operators;

import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        double t = sc.nextDouble();
        double ci = p * Math.pow((1 + r / 100), t) - p;
        System.out.println( "Compound interest is "+ci);
        sc.close();
	}

}
