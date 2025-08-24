package Challenges.Introduction;
import java.util.Scanner;
public class OccuranceOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the string:");
	        String input = sc.nextLine();
	        System.out.println("Enter the character to count:");
	        char ch = sc.next().charAt(0);
	        int count = 0;
	        for (int i = 0; i < input.length(); i++) {
	            if (input.charAt(i) == ch) {
	                count++;
	            }
	        }
	        System.out.println("The character '" + ch + "' occurs " + count + " times");
	}

}
