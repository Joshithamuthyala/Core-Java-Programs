package Challenges.Overloading;

import java.util.Scanner;

public class PrimeORNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean prime = true;
        if(n <= 1) {
            prime = false;
        } else {
            for(int i = 2; i <= n / 2; i++) {
                if(n % i == 0) {
                    prime = false;
                    break;
                }
            }
        }
        if(prime) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }
        sc.close();
	}

}
