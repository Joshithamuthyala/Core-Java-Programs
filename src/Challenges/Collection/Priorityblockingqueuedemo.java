package Challenges.Collection;
import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.Scanner;

public class Priorityblockingqueuedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        PriorityBlockingQueue<Integer> queue = new PriorityBlockingQueue<>();

	        System.out.print("Enter number of elements to add: ");
	        int n = sc.nextInt();

	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter element: ");
	            queue.offer(sc.nextInt());
	        }

	        System.out.println("\nElements in Queue (iteration does not guarantee order):");
	        Iterator<Integer> it = queue.iterator();
	        while (it.hasNext()) {
	            System.out.println(it.next());
	        }

	        System.out.print("\nHow many elements to remove? ");
	        int r = sc.nextInt();

	        System.out.println("\nRemoved elements (poll gives in priority order):");
	        for (int i = 0; i < r && !queue.isEmpty(); i++) {
	            System.out.println("Removed: " + queue.poll());
	        }

	        System.out.println("\nRemaining elements in Queue:");
	        it = queue.iterator();
	        while (it.hasNext()) {
	            System.out.println(it.next());
	        }
	        sc.close();
	}

}
