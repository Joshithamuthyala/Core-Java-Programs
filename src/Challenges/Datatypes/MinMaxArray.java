package Challenges.Datatypes;

import java.util.Scanner;

public class MinMaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the number of elements: ");
	        int n = sc.nextInt();

	        int[] numbers = new int[n];

	        System.out.println("Enter " + n + " numbers:");
	        for (int i = 0; i < n; i++) {
	            numbers[i] = sc.nextInt();
	        }

	        int min = numbers[0];
	        int max = numbers[0];

	        for (int i = 1; i < n; i++) {
	            if (numbers[i] < min) {
	                min = numbers[i];
	            }
	            if (numbers[i] > max) {
	                max = numbers[i];
	            }
	        }

	        System.out.println("Minimum value: " + min);
	        System.out.println("Maximum value: " + max);

	        sc.close();
	}

}
