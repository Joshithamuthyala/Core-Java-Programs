package Challenges.Collection;
import java.util.TreeMap;
import java.util.Scanner;

public class Treemapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        TreeMap<String, String> map = new TreeMap<>();

	        System.out.print("Enter number of key-value pairs to add: ");
	        int n = sc.nextInt();
	        sc.nextLine();

	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter key " + (i + 1) + ": ");
	            String key = sc.nextLine();
	            System.out.print("Enter value for key " + key + ": ");
	            String value = sc.nextLine();
	            map.put(key, value);
	        }

	        System.out.println("\nTreeMap contents (sorted by keys):");
	        for (String key : map.keySet()) {
	            System.out.println(key + " -> " + map.get(key));
	        }

	        System.out.print("\nEnter a key to retrieve its value: ");
	        String searchKey = sc.nextLine();
	        if (map.containsKey(searchKey)) {
	            System.out.println("Value for key '" + searchKey + "' is: " + map.get(searchKey));
	        } else {
	            System.out.println("Key not found.");
	        }

	        sc.close();
	}

}
