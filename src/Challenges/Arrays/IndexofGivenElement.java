package Challenges.Arrays;

import java.util.Scanner;

public class IndexofGivenElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        for (int i = 0; i < n; i++)
	            arr[i] = sc.nextInt();
	        int x = sc.nextInt();
	        int index = -1;
	        for (int i = 0; i < n; i++) {
	            if (arr[i] == x) {
	                index = i;
	                break;
	            }
	        }
	        if (index != -1) {
	            System.out.println("Index: " + index);
	        }else {
	            System.out.println("Not found");
	    }
	        sc.close();
	}

}
