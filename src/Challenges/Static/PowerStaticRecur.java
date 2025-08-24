package Challenges.Static;

import java.util.Scanner;

class PowerCalc {
    static long power(int base, int exp) {
        if (exp == 0)
            return 1;
        return base * power(base, exp - 1);
    }
}
public class PowerStaticRecur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        int base = sc.nextInt();

        System.out.print("Enter exponent: ");
        int exp = sc.nextInt();

        System.out.println(base + " raised to " + exp + " is: " + PowerCalc.power(base, exp));

        sc.close();
	}

}
