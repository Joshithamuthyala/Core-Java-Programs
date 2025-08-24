package Challenges.String;

import java.util.Scanner;

public class Anagams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine().replaceAll("\\s", "").toLowerCase();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine().replaceAll("\\s", "").toLowerCase();
        if(s1.length() != s2.length()) {
            System.out.println("Strings are not anagrams");
            return;
        }
        int[] freq = new int[256];
        for(int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i)]++;
            freq[s2.charAt(i)]--;
        }
        for(int n : freq) {
            if(n != 0) {
                System.out.println("Strings are not anagrams");
                return;
            }
        }
        System.out.println("Strings are anagrams");
        sc.close();
	}

}
