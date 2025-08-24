package Challenges.String;

import java.util.Scanner;

public class FirstNorepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(s.indexOf(c) == s.lastIndexOf(c)) {
                System.out.println("First non-repeated character: " + c);
                return;
            }
        }
        System.out.println("No non-repeated character found");
        sc.close();
	}

}
