package Challenges.String;

import java.util.Scanner;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i+1) + ": ");
            arr[i] = sc.nextLine();
        }
        String prefix = arr[0];
        for(int i = 1; i < n; i++) {
            while(arr[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if(prefix.isEmpty()) {
                    System.out.println("No common prefix");
                    return;
                }
            }
        }
        System.out.println("Longest common prefix: " + prefix);
        sc.close();
	}

}
