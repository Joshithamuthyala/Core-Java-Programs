package Challenges.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        ArrayList<String> list = new ArrayList<>();

	        System.out.print("Enter number of elements: ");
	        int n = sc.nextInt();
	        sc.nextLine();

	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter element: ");
	            list.add(sc.nextLine());
	        }

	        System.out.println("\nIterating using Iterator:");
	        Iterator<String> it = list.iterator();
	        while (it.hasNext()) {
	            System.out.println(it.next());
	        }
	        sc.close();
	}

}
