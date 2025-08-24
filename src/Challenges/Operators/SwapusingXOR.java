package Challenges.Operators;
import java.util.Scanner;
public class SwapusingXOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("before swapping a="+a+"b="+b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swapping a="+a + " b=" + b);
        sc.close();
	}

}
