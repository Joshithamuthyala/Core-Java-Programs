package Challenges.Introduction;
import java.util.Scanner;
public class PowerofNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base:");
        double base = sc.nextDouble();
        System.out.println("Enter the exponent:");
        double exponent = sc.nextDouble();
        double result = Math.pow(base, exponent);
        System.out.println(base + "  to the power of " + exponent + " is: " + result);
	}

}
