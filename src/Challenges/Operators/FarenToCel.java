package Challenges.Operators;

import java.util.Scanner;

public class FarenToCel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        double f = sc.nextDouble();
        double c = (f - 32) * 5 / 9;
        System.out.println( "temp in celsius is"+c);
        sc.close();
	}

}
