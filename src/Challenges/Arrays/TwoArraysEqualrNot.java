package Challenges.Arrays;

import java.util.Scanner;

public class TwoArraysEqualrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] a = new int[n1];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++)
            a[i] = sc.nextInt();
        
        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] b = new int[n2];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++)
            b[i] = sc.nextInt();
        
        if (n1 != n2) {
            System.out.println("Arrays are Not Equal");
            return;
        }
        
        boolean equal = true;
        for (int i = 0; i < n1; i++) {
            if (a[i] != b[i]) {
                equal = false;
                break;
            }
        }
        
        if (equal) {
            System.out.println("Arrays are Equal");
        }else {
            System.out.println("Arrays are Not Equal");
    }
        sc.close();
	}

}
