package Challenges.String;

import java.util.Scanner;

public class ConcatString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();
        String res = s1 + s2;
        System.out.println("Concatenated string: " + res);
        sc.close();
	}

}
