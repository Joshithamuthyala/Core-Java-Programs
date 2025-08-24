package Challenges.String;
import java.util.Scanner;
public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String s = sc.nextLine();
        String res = "";
        int end = s.length();
        for(int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) == ' ') {
                for(int j = i + 1; j < end; j++) {
                    res += s.charAt(j);
                }
                res += " ";
                end = i;
            }
        }
        for(int j = 0; j < end; j++) {
            res += s.charAt(j);
        }
        System.out.println("Reversed sentence: " + res);
        
        sc.close();
	}

}
