package Challenges.Operators;
import java.util.Scanner;
public class Bitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("bitwise and"+(a & b));
        System.out.println("bitwise or"+(a | b));
        System.out.println("bitwise Xor"+(a ^ b));
        sc.close();
	}

}
