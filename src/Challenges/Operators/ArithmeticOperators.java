package Challenges.Operators;
import java.util.Scanner;
public class ArithmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("sum is"+(a + b));
        System.out.println("sub is"+(a - b));
        System.out.println("Mul is"+(a * b));
        System.out.println("div is"+(a / b));
        System.out.println("mod is "+(a % b));
        sc.close();
	}

}
