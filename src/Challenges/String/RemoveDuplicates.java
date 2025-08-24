package Challenges.String;

import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        String res = "";
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(res.indexOf(c) == -1) {
                res += c;
            }
        }
        System.out.println("String after removing duplicates: " + res);
        sc.close();
	}

}
