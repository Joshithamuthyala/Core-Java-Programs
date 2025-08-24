package Challenges.Introduction;
import java.util.Scanner;
public class Roots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();

        double disc = b * b - 4 * a * c;
        if (disc > 0) {
            double r1 = (-b + Math.sqrt(disc)) / (2 * a);
            double r2 = (-b - Math.sqrt(disc)) / (2 * a);
            System.out.println("Roots are real and distinct.");
            System.out.println("Root 1: " + r1);
            System.out.println("Root 2: " + r2);
        } else if (disc == 0) {
            double r = -b / (2 * a);
            System.out.println("Roots are real and equal.");
            System.out.println("Root: " + r);
        } else {
            double rp = -b / (2 * a);
            double ip = Math.sqrt(-disc) / (2 * a);
            System.out.println("Roots are complex and imaginary.");
            System.out.println("Root 1: " + rp + " + " + ip + "i");
            System.out.println("Root 2: " + rp + " - " + ip + "i");
        }

        sc.close();
	}

}
