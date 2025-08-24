package Challenges.Introduction;
import java.util.Scanner;
public class SumofEleinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the size of the array:");
	        int size = sc.nextInt();

	        int[] arr = new int[size];
	        int sum = 0;

	        System.out.println("Enter the elements of the array:");
	        for(int i = 0; i < size; i++) {
	            arr[i] = sc.nextInt();
	            sum += arr[i];
	        }

	        System.out.println("Sum of array elements: " + sum);
	    }
	}


