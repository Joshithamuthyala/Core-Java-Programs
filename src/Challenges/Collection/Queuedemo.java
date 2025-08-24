package Challenges.Collection;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queuedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        Queue<String> queue = new LinkedList<>();

	        System.out.print("Enter number of elements to add in Queue: ");
	        int n = sc.nextInt();
	        sc.nextLine();

	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter element " + (i + 1) + ": ");
	            String element = sc.nextLine();
	            queue.add(element);
	        }

	        System.out.println("\nQueue elements (in insertion order):");
	        for (String e : queue) {
	            System.out.println(e);
	        }

	        System.out.print("\nDo you want to remove an element? (yes/no): ");
	        String choice = sc.nextLine();
	        if (choice.equalsIgnoreCase("yes")) {
	            String removed = queue.poll();  // removes head
	            if (removed != null) {
	                System.out.println("Removed element: " + removed);
	            } else {
	                System.out.println("Queue is empty, nothing to remove.");
	            }
	        }

	        System.out.println("\nQueue after removal:");
	        for (String e : queue) {
	            System.out.println(e);
	        }
	        sc.close();
	}

}
