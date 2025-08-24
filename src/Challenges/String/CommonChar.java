package Challenges.String;

import java.util.Scanner;

public class CommonChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter first string: ");
		        String s1 = sc.nextLine();
		        System.out.print("Enter second string: ");
		        String s2 = sc.nextLine();
		        String res = "";
		        for(int i = 0; i < s1.length(); i++) {
		            char c = s1.charAt(i);
		            if(s2.indexOf(c) != -1 && res.indexOf(c) == -1) {
		                res += c;
		            }
		        }
		        System.out.println("Common characters: " + res);
		        sc.close();
	}

}
