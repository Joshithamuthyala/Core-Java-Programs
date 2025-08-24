package Challenges.Operators;

import java.util.Scanner;

public class StringReverseUsingRecursion {
	static void rev(String s, int i) {
        if (i < 0) return;
        System.out.print(s.charAt(i));
        rev(s, i - 1);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        String str = sc.nextLine();
	        rev(str, str.length() - 1);
	        sc.close();
	}

}
