package Challenges.Operators;

import java.util.Scanner;

public class PrimeOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean prime = true;
        if (n <= 1) prime = false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        if (prime)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
        sc.close();
	}

}
