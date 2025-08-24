package Challenges.EceptionHandling;

import java.util.Scanner;

public class NegativeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter array size: ");
            int size = sc.nextInt();

            int arr[] = new int[size];  
            System.out.println("Array of size " + size + " created successfully.");
        } 
        catch (NegativeArraySizeException e) {
            System.out.println("Exception Caught: " + e);
        }

        System.out.println("Program continues...");
        sc.close();
	}

}
