package Challenges.Static;

import java.util.Scanner;

class NumOp {
    static int max(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }
}

public class MAXTWO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter first number: ");
	        int x = sc.nextInt();

	        System.out.print("Enter second number: ");
	        int y = sc.nextInt();

	        System.out.println("Maximum is: " + NumOp.max(x, y));

	        sc.close();
	}

}
