package Challenges.EceptionHandling;
import java.util.*;
public class MissingREsExcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            ResourceBundle bundle = ResourceBundle.getBundle("nonexistent");
	            String value = bundle.getString("key");
	            System.out.println(value);
	        } catch (MissingResourceException e) {
	            System.out.println("Caught MissingResourceException: " + e);
	        }
	        System.out.println("Program continues after handling exception...");
	}

}
