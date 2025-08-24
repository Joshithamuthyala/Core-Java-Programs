package Challenges.Datatypes;

import java.util.Scanner;

public class SubstringIndEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();
	        System.out.println("Substring (from index 2 to 5): " + str.substring(2, 5));
	        System.out.print("Enter a character to find: ");
	        char ch = sc.next().charAt(0);
	        int index = str.indexOf(ch);
	        if (index != -1) {
	            System.out.println("First occurrence of '" + ch + "' is at index: " + index);
	        } else {
	            System.out.println("Character not found.");
	        }

	        sc.nextLine(); 

	        System.out.print("Enter another string to compare: ");
	        String str2 = sc.nextLine();
	        if (str.equals(str2)) {
	            System.out.println("Strings are equal.");
	        } else {
	            System.out.println("Strings are not equal.");
	        }
	        sc.close();
	}

}
