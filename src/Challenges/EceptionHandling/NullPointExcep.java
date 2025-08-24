package Challenges.EceptionHandling;

public class NullPointExcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            String str = null;   // null reference
	            System.out.println("Length: " + str.length()); // causes NullPointerException
	        } 
	        catch (NullPointerException e) {
	            System.out.println("Exception Caught: " + e);
	        }

	        System.out.println("Program continues...");
	}

}
