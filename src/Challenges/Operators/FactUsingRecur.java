package Challenges.Operators;

import java.util.Scanner;

public class FactUsingRecur {
	static int fact(int n) {
        if (n == 0 || n == 1) return 1;
        return n * fact(n - 1);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        System.out.println(fact(n));
	        sc.close();
	}

}
