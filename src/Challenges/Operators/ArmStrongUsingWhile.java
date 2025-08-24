package Challenges.Operators;

import java.util.Scanner;

public class ArmStrongUsingWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
        int n = sc.nextInt();
        int temp = n, sum = 0, digits = 0;
        int t = n;
        while (t != 0) {
            digits++;
            t /= 10;
        }
        t = n;
        while (t != 0) {
            int r = t % 10;
            sum += Math.pow(r, digits);
            t /= 10;
        }
        if (sum == temp)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
        sc.close();
	}

}
