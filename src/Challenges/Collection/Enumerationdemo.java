package Challenges.Collection;
import java.util.Vector;
import java.util.Enumeration;
public class Enumerationdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vec = new Vector<>();

        vec.add("Apple");
        vec.add("Banana");
        vec.add("Cherry");
        vec.add("Mango");

        System.out.println("Iterating using Enumeration:");
        Enumeration<String> e = vec.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
	}

}
