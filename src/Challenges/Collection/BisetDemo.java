package Challenges.Collection;
import java.util.BitSet;
import java.util.Scanner;

public class BisetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        BitSet bitset = new BitSet();

	        System.out.print("Enter number of elements to set in BitSet: ");
	        int n = sc.nextInt();

	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter position to set (integer index): ");
	            int pos = sc.nextInt();
	            bitset.set(pos); // add (set) bit at given index
	        }

	        System.out.println("\nBitSet elements (set positions):");
	        for (int i = bitset.nextSetBit(0); i >= 0; i = bitset.nextSetBit(i + 1)) {
	            System.out.println(i);
	        }

	        System.out.print("\nEnter position to clear (remove): ");
	        int removePos = sc.nextInt();
	        bitset.clear(removePos);

	        System.out.println("\nBitSet after removal:");
	        for (int i = bitset.nextSetBit(0); i >= 0; i = bitset.nextSetBit(i + 1)) {
	            System.out.println(i);
	        }

	        sc.close();
	}

}
