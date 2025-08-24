package Challenges.Introduction;
import java.util.Scanner;
public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);

	        System.out.print("Enter size of array: ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];
	        System.out.println("Enter " + n + " integers:");
	        for(int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        int first = Integer.MIN_VALUE;
	        int second = Integer.MIN_VALUE;

	        for(int num : arr) {
	            if(num > first) {
	                second = first;
	                first = num;
	            } else if(num > second && num != first) {
	                second = num;
	            }
	        }

	        if(second == Integer.MIN_VALUE) {
	            System.out.println("There is no second largest element.");
	        } else {
	            System.out.println("Second largest number is: " + second);
	        }
	        sc.close();
	}

}
