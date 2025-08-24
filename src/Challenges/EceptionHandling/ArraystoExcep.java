package Challenges.EceptionHandling;

public class ArraystoExcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            Object[] strArray = new String[3];
	            strArray[0] = 100;
	            System.out.println("Element inserted successfully!");
	        } catch (ArrayStoreException e) {
	            System.out.println("Caught ArrayStoreException: " + e);
	        }
	        System.out.println("Program continues after handling exception...");
	}

}
