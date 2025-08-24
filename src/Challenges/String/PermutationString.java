package Challenges.String;

import java.util.Scanner;

class StringPermutations {
    static void permute(String s, String ans) {
        if(s.length() == 0) {
            System.out.println(ans);
            return;
        }
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String left = s.substring(0, i);
            String right = s.substring(i + 1);
            permute(left + right, ans + ch);
        }
    }
}
public class PermutationString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        StringPermutations.permute(s, "");
        sc.close();
		
	}
}
