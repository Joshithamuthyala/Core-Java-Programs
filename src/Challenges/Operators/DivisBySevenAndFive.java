package Challenges.Operators;

import java.util.Scanner;

public class DivisBySevenAndFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 7 == 0 && n % 5 == 0)
            System.out.println("divisible by 5 and 7 ");
        else
            System.out.println("Not divisible by 5 and 7 ");
        sc.close();
	}

}
