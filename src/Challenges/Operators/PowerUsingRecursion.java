package Challenges.Operators;

import java.util.Scanner;

public class PowerUsingRecursion {
	static int power(int a, int b) {
        if (b == 0) return 1;
        return a * power(a, b - 1);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exp = sc.nextInt();
        System.out.println(power(base, exp));
        sc.close();
	}

}
