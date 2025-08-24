package Challenges.String;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		String str= sc.nextLine();
		String res="";
		for(int i=str.length()-1;i>=0;i--) {
			res+=str.charAt(i);
		}
		if(str.equals(res)==true) {
			System.out.println("The given strig is a palindrome");
		}
		else {
			System.out.println("The given string is not a palindrome");
		}
		sc.close();
	}

}
