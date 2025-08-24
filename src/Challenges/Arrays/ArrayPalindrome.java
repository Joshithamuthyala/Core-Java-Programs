package Challenges.Arrays;

import java.util.Scanner;

public class ArrayPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        boolean isPal = true;
        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - 1 - i]) {
                isPal = false;
                break;
            }
        }
        
        if (isPal) {
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
    }
        sc.close();
	}

}
