package Challenges.Collection;
import java.util.LinkedList;
import java.util.Scanner;
public class Linkedlistdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();

        System.out.print("Enter number of elements to add: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            String s = sc.nextLine();
            list.add(s);
        }

        System.out.println("\nLinkedList elements:");
        for (String s : list) {
            System.out.println(s);
        }

        System.out.print("\nEnter element to remove: ");
        String rem = sc.nextLine();
        if (list.remove(rem)) {
            System.out.println(rem + " removed successfully.");
        } else {
            System.out.println(rem + " not found.");
        }

        System.out.println("\nLinkedList after removal:");
        for (String s : list) {
            System.out.println(s);
        }

        sc.close();
	}

}
