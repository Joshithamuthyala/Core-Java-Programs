package Challenges.Introduction;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,count=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number:");
		a=sc.nextInt();
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				count++;
			}
		}
			if(count==2) {
				System.out.println("It is a prime");
			}
			else {
				System.out.println("It is not a prime");
			
		}
	}

}
