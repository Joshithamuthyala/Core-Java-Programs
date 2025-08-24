package Challenges.Collection;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.Scanner;

public class ArrayblockingqueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter capacity of Queue: ");
        int capacity = sc.nextInt();
        sc.nextLine();

        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(capacity);

        System.out.print("Enter number of elements to add: ");
        int n = sc.nextInt();
        sc.nextLine();

        try {
            for (int i = 0; i < n; i++) {
                System.out.print("Enter element: ");
                queue.put(sc.nextLine());
            }

            System.out.println("\nElements in Queue:");
            Iterator<String> it = queue.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }

            System.out.print("\nHow many elements to remove? ");
            int r = sc.nextInt();

            for (int i = 0; i < r && !queue.isEmpty(); i++) {
                System.out.println("Removed: " + queue.take());
            }

            System.out.println("\nRemaining elements in Queue:");
            it = queue.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        } catch (InterruptedException e) {
            System.out.println("Operation interrupted: " + e.getMessage());
        }

        sc.close();
	}

}
