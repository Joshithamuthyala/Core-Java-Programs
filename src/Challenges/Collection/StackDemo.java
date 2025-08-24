package Challenges.Collection;
import java.util.Stack;
import java.util.Scanner;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<>();

        System.out.print("Enter number of elements to push into Stack: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            String element = sc.nextLine();
            stack.push(element);
        }

        System.out.println("\nStack elements (top to bottom):");
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println(stack.get(i));
        }

        System.out.print("\nDo you want to pop an element? (yes/no): ");
        String choice = sc.nextLine();
        if (choice.equalsIgnoreCase("yes")) {
            if (!stack.isEmpty()) {
                String removed = stack.pop();
                System.out.println("Popped element: " + removed);
            } else {
                System.out.println("Stack is empty, nothing to pop.");
            }
        }

        System.out.println("\nStack after pop:");
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println(stack.get(i));
        }
        sc.close();
	}

}
