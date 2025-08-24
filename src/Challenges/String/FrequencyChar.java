package Challenges.String;

import java.util.Scanner;

public class FrequencyChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        int[] freq = new int[256];
        for(int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }
        for(int i = 0; i < freq.length; i++) {
            if(freq[i] > 0) {
                System.out.println((char)i + " - " + freq[i]);
            }
        }
        sc.close();
	}

}
