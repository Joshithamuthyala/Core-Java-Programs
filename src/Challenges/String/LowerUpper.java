package Challenges.String;

import java.util.Scanner;

public class LowerUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        String res = "";
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isLowerCase(ch)) {
                res += Character.toUpperCase(ch);
            } else if(Character.isUpperCase(ch)) {
                res += Character.toLowerCase(ch);
            } else {
                res += ch;
            }
        }
        System.out.println("Converted string: " + res);
        sc.close();
	}

}
