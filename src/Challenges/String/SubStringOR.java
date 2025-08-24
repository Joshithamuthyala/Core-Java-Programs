package Challenges.String;

import java.util.Scanner;

public class SubStringOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter main string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter substring: ");
        String s2 = sc.nextLine();
        boolean found = false;
        for(int i = 0; i <= s1.length() - s2.length(); i++) {
            int j;
            for(j = 0; j < s2.length(); j++) {
                if(s1.charAt(i + j) != s2.charAt(j)) {
                    break;
                }
            }
            if(j == s2.length()) {
                found = true;
                break;
            }
        }
        if(found) {
            System.out.println("Substring found");
        } else {
            System.out.println("Substring not found");
        }
        sc.close();
	}

}
