package Challenges.Static;

import java.util.Scanner;

class NumOps {
    static int min(int a, int b) {
        if (a < b)
            return a;
        else
            return b;
    }
}
public class MINStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = sc.nextInt();

        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        System.out.println("Minimum is: " + NumOps.min(x, y));

        sc.close();
	}

}
