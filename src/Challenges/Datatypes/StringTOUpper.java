package Challenges.Datatypes;

import java.util.Scanner;

public class StringTOUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter a string: ");
		        String str = sc.nextLine();

		        String upper = str.toUpperCase();

		        System.out.println("Uppercase String: " + upper);
		        sc.close();
	}

}
