package Challenges.String;

import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine().toLowerCase();
        boolean[] present = new boolean[26];
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c >= 'a' && c <= 'z') {
                present[c - 'a'] = true;
            }
        }
        boolean pangram = true;
        for(boolean b : present) {
            if(!b) {
                pangram = false;
                break;
            }
        }
        if(pangram) {
            System.out.println("The string is a pangram");
        } else {
            System.out.println("The string is not a pangram");
        }
        sc.close();
	}

}
