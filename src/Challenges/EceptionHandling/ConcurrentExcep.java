package Challenges.EceptionHandling;
import java.util.*;
public class ConcurrentExcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            List<String> list = new ArrayList<>();
            list.add("A");
            list.add("B");
            list.add("C");

            for (String s : list) {
                if (s.equals("B")) {
                    list.remove(s);
                }
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("Caught ConcurrentModificationException: " + e);
        }
        System.out.println("Program continues after handling exception...");
    }
	

}
