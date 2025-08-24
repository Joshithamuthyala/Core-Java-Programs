package Challenges.EceptionHandling;

public class Classnot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            Class.forName("com.example.UnknownClass");
            System.out.println("Class Loaded Successfully");
        } 
        catch (ClassNotFoundException e) {
            System.out.println("Exception Caught: " + e);
        }

        System.out.println("Program continues...");
	}

}
