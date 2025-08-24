package Challenges.String;

import java.util.Scanner;

public class FirstRepeatinchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        int[] freq = new int[256];
        for(int i = 0; i < s.length(); i++) {
            if(freq[s.charAt(i)] == 1) {
                System.out.println("First repeating character: " + s.charAt(i));
                return;
            }
            freq[s.charAt(i)]++;
        }
        System.out.println("No repeating character found");
        sc.close();
	}

}
