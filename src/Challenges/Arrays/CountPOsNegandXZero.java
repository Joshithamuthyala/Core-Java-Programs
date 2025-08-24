package Challenges.Arrays;

import java.util.Scanner;

public class CountPOsNegandXZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }
        int pos = 0, neg = 0, zero = 0;
        for(int i=0;i<n;i++) {
            if(a[i] > 0) {
                pos++;
            }
            else if(a[i] < 0) {
                neg++;
            }
            else {
                zero++;
        }
        }
        System.out.println("Positive elements: " + pos);
        System.out.println("Negative elements: " + neg);
        System.out.println("Zero elements: " + zero);
        sc.close();
	}

}
