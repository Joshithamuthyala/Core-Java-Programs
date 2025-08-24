package Challenges.EceptionHandling;

public class StackOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			recursiveMethod();
		} 
        catch (StackOverflowError e) {
            System.out.println("Error Caught: " + e);
        }

        System.out.println("Program continues...");
    }

    static void recursiveMethod() {
       recursiveMethod();
	}

}
