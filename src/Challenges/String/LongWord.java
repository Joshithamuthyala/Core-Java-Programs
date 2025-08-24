package Challenges.String;

import java.util.Scanner;

public class LongWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        String[] words = s.split(" ");
        String longest = "";
        for(String w : words) {
            if(w.length() > longest.length()) {
                longest = w;
            }
        }
        System.out.println("Longest word: " + longest);
        sc.close();
	}

}
