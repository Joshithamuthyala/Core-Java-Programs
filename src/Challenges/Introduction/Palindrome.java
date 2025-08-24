package Challenges.Introduction;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int n= sc.nextInt();
		int num=n;
		int rev=0,rem;
		while(n>0) {
		rem= n%10;
		rev= rev*10+rem;
		n=n/10;
		}
		if(num==rev) {
			System.out.println(num+" is a palindrome");
		}
		else {
			System.out.println(num+" is not a palindrome");
		}
	}

}
