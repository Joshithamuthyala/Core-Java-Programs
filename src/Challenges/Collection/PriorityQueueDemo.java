package Challenges.Collection;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        System.out.print("Enter number of elements to add in PriorityQueue: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int element = sc.nextInt();
            pq.add(element);
        }

        System.out.println("\nPriorityQueue elements (natural order):");
        for (Integer e : pq) {
            System.out.println(e);
        }

        System.out.print("\nDo you want to remove the smallest element? (yes/no): ");
        String choice = sc.next();
        if (choice.equalsIgnoreCase("yes")) {
            Integer removed = pq.poll(); // removes smallest element
            if (removed != null) {
                System.out.println("Removed element: " + removed);
            } else {
                System.out.println("PriorityQueue is empty, nothing to remove.");
            }
        }

        System.out.println("\nPriorityQueue after removal:");
        for (Integer e : pq) {
            System.out.println(e);
        }

        sc.close();
	}

}
