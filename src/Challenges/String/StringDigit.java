package Challenges.String;

import java.util.Scanner;

public class StringDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        boolean onlyDigits = true;
        for(int i = 0; i < s.length(); i++) {
            if(!Character.isDigit(s.charAt(i))) {
                onlyDigits = false;
                break;
            }
        }
        if(onlyDigits) {
            System.out.println("String contains only digits");
        } else {
            System.out.println("String does not contain only digits");
        }
        sc.close();
	}

}
