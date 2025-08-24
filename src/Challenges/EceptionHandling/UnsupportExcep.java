package Challenges.EceptionHandling;
import java.util.*;
public class UnsupportExcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            List<String> list = Arrays.asList("A", "B", "C");
            list.add("D");
        } catch (UnsupportedOperationException e) {
            System.out.println("Caught UnsupportedOperationException: " + e);
        }
        System.out.println("Program continues after handling exception...");
	}

}
