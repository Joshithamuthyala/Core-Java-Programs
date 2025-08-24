package Challenges.EceptionHandling;

public class ArrayIndexOB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            int arr[] = {10, 20, 30, 40, 50};
            System.out.println("Element at index 2: " + arr[2]);
            System.out.println("Element at index 10: " + arr[10]); // error
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception Caught: " + e);
        }
        System.out.println("Program continues...");
	}

}
