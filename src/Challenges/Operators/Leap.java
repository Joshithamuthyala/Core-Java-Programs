package Challenges.Operators;

import java.util.Scanner;

public class Leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        String res = (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0)) ? "Leap Year" : "Not Leap Year";
        System.out.println(res);
        sc.close();
	}

}
