package Challenges.Operators;

import java.util.Scanner;

public class AreaofTriHerons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println( "Area of Trianglr using herons is"+area);
        sc.close();
	}

}
