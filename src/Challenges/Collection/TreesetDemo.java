package Challenges.Collection;
import java.util.TreeSet;
import java.util.Scanner;

public class TreesetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        TreeSet<String> set = new TreeSet<>();

        System.out.print("Enter number of elements to add: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            String s = sc.nextLine();
            set.add(s);
        }

        System.out.println("\nTreeSet elements (sorted):");
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

        System.out.println("\nTreeSet after removal:");
        for (String s : set) {
            System.out.println(s);
        }

        sc.close();
	}

}
