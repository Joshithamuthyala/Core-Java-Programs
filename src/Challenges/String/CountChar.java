package Challenges.String;

import java.util.Scanner;

public class CountChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        System.out.print("Enter the character: ");
        char c = sc.next().charAt(0);
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == c) {
                count++;
            }
        }
        System.out.println("The character '" + c + "' occurs " + count + " times.");
        sc.close();
	}

}
