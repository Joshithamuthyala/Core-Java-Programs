package Challenges.Static;

import java.util.Scanner;

class StringReverse {
    static String reverse(String str) {
        if (str.isEmpty())
            return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
public class ReverseRecurStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("Reversed String: " + StringReverse.reverse(input));
        sc.close();
	}

}
