package Challenges.Collection;
import java.util.Hashtable;
import java.util.Scanner;

public class Keyvaluedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        Hashtable<Integer, String> table = new Hashtable<>();

        System.out.print("Enter number of key-value pairs to add: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter key (integer): ");
            int key = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter value (string): ");
            String value = sc.nextLine();
            table.put(key, value);
        }

        System.out.print("\nEnter key to retrieve value: ");
        int searchKey = sc.nextInt();

        if (table.containsKey(searchKey)) {
            System.out.println("Value for key " + searchKey + " is: " + table.get(searchKey));
        } else {
            System.out.println("Key not found.");
        }

        sc.close();
	}

}
