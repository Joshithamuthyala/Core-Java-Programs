package Challenges.String;

import java.util.Scanner;

public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        int[] freq = new int[256];
        for(int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }
        System.out.println("Duplicate characters:");
        for(int i = 0; i < freq.length; i++) {
            if(freq[i] > 1) {
                System.out.println((char)i + " - " + freq[i]);
            }
        }
        sc.close();
	}

}
