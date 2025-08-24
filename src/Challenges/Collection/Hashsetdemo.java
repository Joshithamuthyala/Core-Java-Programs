package Challenges.Collection;
import java.util.HashSet;
import java.util.Scanner;

public class Hashsetdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();

        System.out.print("Enter number of elements to add: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            String s = sc.nextLine();
            set.add(s);
        }

        System.out.println("\nHashSet elements:");
        for (String s : set) {
            System.out.println(s);
        }

        System.out.print("\nEnter element to remove: ");
        String rem = sc.nextLine();
        if (set.remove(rem)) {
            System.out.println(rem + " removed successfully.");
        } else {
            System.out.println(rem + " not found.");
        }

        System.out.println("\nHashSet after removal:");
        for (String s : set) {
            System.out.println(s);
        }

        sc.close();
	}

}
