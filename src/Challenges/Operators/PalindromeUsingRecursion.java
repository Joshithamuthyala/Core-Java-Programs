package Challenges.Operators;
import java.util.Scanner;

public class PalindromeUsingRecursion {
	static int rev(int n, int r) {
        if (n == 0) return r;
        return rev(n / 10, r * 10 + n % 10);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == rev(n, 0))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
        sc.close();
    }
		
	}


