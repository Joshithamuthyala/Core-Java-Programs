package Challenges.EceptionHandling;
import java.util.*;
public class NoSuchEleExcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            Scanner sc = new Scanner(System.in);
	            System.out.println("Enter an integer:");
	            int num1 = sc.nextInt();
	            int num2 = sc.nextInt(); 
	        } catch (NoSuchElementException e) {
	            System.out.println("Caught NoSuchElementException: " + e);
	        }
	        System.out.println("Program continues after handling exception...");
	}

}
