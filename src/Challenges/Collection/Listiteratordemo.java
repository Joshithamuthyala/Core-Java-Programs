package Challenges.Collection;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Listiteratordemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element: ");
            list.add(sc.nextLine());
        }

        System.out.println("\nIterating forward:");
        ListIterator<String> it = list.listIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\nIterating backward:");
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }

        sc.close();
	}

}
