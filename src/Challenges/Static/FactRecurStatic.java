package Challenges.Static;

import java.util.Scanner;

class FactorialCalc {
    static long factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }
}

public class FactRecurStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Factorial of " + num + " is: " + FactorialCalc.factorial(num));

        sc.close();
	}

}
