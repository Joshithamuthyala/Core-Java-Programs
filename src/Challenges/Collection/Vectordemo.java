package Challenges.Collection;
import java.util.Vector;
import java.util.Scanner;

public class Vectordemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        Vector<String> vec = new Vector<>();

        System.out.print("Enter number of elements to add: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element: ");
            String element = sc.nextLine();
            vec.add(element);
        }

        System.out.println("\nVector elements:");
        for (String e : vec) {
            System.out.println(e);
        }

        System.out.print("\nEnter element to remove: ");
        String rem = sc.nextLine();
        vec.remove(rem);

        System.out.println("\nVector after removal:");
        for (String e : vec) {
            System.out.println(e);
        }

        sc.close();
	}

}
