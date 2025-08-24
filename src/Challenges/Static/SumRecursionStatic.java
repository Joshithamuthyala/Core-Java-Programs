package Challenges.Static;

import java.util.Scanner;

class DigitSum {
    static int sumOfDigits(int n) {
        if (n == 0)
            return 0;
        return (n % 10) + sumOfDigits(n / 10);
    }
}
public class SumRecursionStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Sum of digits: " + DigitSum.sumOfDigits(num));

        sc.close();
	}

}
