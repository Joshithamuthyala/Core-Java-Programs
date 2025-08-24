package Challenges.EceptionHandling;

public class IllegalArgExcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            Thread t = new Thread();
            t.setPriority(20);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e);
        }
        System.out.println("Program continues after handling exception...");
    }
}
