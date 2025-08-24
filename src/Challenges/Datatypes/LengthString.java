package Challenges.Datatypes;

import java.util.Scanner;

public class LengthString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int length = str.length();

        System.out.println("Length of the string: " + length);
        sc.close();
	}

}
