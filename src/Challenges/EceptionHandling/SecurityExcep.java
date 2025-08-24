package Challenges.EceptionHandling;

public class SecurityExcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            System.setSecurityManager(new SecurityManager());
            System.exit(0);
        } catch (SecurityException e) {
            System.out.println("Caught SecurityException: " + e);
        }
        System.out.println("Program continues after handling exception...");
	}

}
