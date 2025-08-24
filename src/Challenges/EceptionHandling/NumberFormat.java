package Challenges.EceptionHandling;

public class NumberFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            String str = "abc";   // invalid number
	            int num = Integer.parseInt(str); // causes NumberFormatException
	            System.out.println("Number: " + num);
	        } 
	        catch (NumberFormatException e) {
	            System.out.println("Exception Caught: " + e);
	        }

	        System.out.println("Program continues...");
	}

}
