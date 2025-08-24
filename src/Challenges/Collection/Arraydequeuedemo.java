package Challenges.Collection;
import java.util.ArrayDeque;
import java.util.Scanner;

public class Arraydequeuedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        ArrayDeque<String> deque = new ArrayDeque<>();

        System.out.print("Enter number of elements to add in ArrayDeque: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            String element = sc.nextLine();
            deque.add(element);
        }

        System.out.println("\nArrayDeque elements (in insertion order):");
        for (String e : deque) {
            System.out.println(e);
        }

        System.out.print("\nDo you want to remove an element from front or back? (front/back/none): ");
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("front")) {
            String removed = deque.pollFirst();
            System.out.println("Removed from front: " + removed);
        } else if (choice.equalsIgnoreCase("back")) {
            String removed = deque.pollLast();
            System.out.println("Removed from back: " + removed);
        } else {
            System.out.println("No element removed.");
        }

        System.out.println("\nArrayDeque after removal:");
        for (String e : deque) {
            System.out.println(e);
        }

        sc.close();
	}

}
