package Challenges.String;

import java.util.Scanner;

public class CapFirstLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String s = sc.nextLine();
        String res = "";
        boolean cap = true;
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(cap && ch != ' ') {
                res += Character.toUpperCase(ch);
                cap = false;
            } else {
                res += ch;
            }
            if(ch == ' ') {
                cap = true;
            }
        }
        System.out.println("Capitalized sentence: " + res);
        sc.close();
	}

}
