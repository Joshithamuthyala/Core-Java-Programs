package Challenges.String;

import java.util.Scanner;

public class StringRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();
        if(s1.length() == s2.length() && (s1 + s1).contains(s2)) {
            System.out.println("String 2 is a rotation of String 1");
        } else {
            System.out.println("String 2 is not a rotation of String 1");
        }
        sc.close();
	}

}
