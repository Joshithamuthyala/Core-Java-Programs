package Challenges.Operators;

import java.util.Scanner;

public class SumOfEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
		for (int i = 2; i <= n; i += 2)
            sum += i;
        System.out.println( "sum of even is"+sum);
        sc.close();
	}

}
