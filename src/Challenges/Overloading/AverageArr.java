package Challenges.Overloading;

import java.util.Scanner;

public class AverageArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        double avg = (double) sum / n;
        System.out.println("Average: " + avg);
        sc.close();
	}

}
