package Challenges.Collection;
import java.util.Scanner;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
public class ConcurrentLinkedqueuedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();

	        System.out.print("Enter number of elements to add: ");
	        int n = sc.nextInt();
	        sc.nextLine();

	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter element: ");
	            queue.add(sc.nextLine());
	        }

	        System.out.println("\nElements in Queue:");
	        Iterator<String> it = queue.iterator();
	        while (it.hasNext()) {
	            System.out.println(it.next());
	        }

	        System.out.print("\nHow many elements to remove? ");
	        int r = sc.nextInt();

	        for (int i = 0; i < r && !queue.isEmpty(); i++) {
	            System.out.println("Removed: " + queue.poll());  // removes head safely
	        }

	        System.out.println("\nRemaining elements in Queue:");
	        it = queue.iterator();
	        while (it.hasNext()) {
	            System.out.println(it.next());
	        }

	        sc.close();
	}

}
