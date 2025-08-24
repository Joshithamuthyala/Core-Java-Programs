package Challenges.Operators;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the string");
	        char ch = sc.next().toLowerCase().charAt(0);
	        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
	            System.out.println("Vowel");
	        else
	            System.out.println("Consonant");
	        sc.close();
	}

}
