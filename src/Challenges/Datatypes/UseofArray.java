package Challenges.Datatypes;

import java.util.Scanner;

public class UseofArray {

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

        System.out.println("Array elements:");
        for (int i = 0; i < n; i++) {
            System.out.println(numbers[i]);
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum of elements: " + sum);
        sc.close();
	}

}
