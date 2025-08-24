package Challenges.EceptionHandling;
import java.util.*;
public class IllegalExcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            List<String> list = new ArrayList<>();
            list.add("A");
            list.add("B");
            list.add("C");

            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                String val = it.next();
                it.remove();
                it.remove();  
            }
        } catch (IllegalStateException e) {
            System.out.println("Caught IllegalStateException: " + e);
        }
	}

}
