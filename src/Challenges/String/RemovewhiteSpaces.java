package Challenges.String;

import java.util.Scanner;

public class RemovewhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        String res = "";
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != ' ') {
                res += s.charAt(i);
            }
        }
        System.out.println("String without spaces: " + res);
        sc.close();
	}

}
