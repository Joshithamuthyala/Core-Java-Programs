package Challenges.Introduction;
import java.util.*;
public class Fact{
	static int facto(int n) {
		if(n==0||n==1) {
			return 1;
		}
		else {
			return n* facto(n-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		System.out.println("enter a number");
		int a= sc.nextInt();
		int res=facto(a);
		System.out.println("the factorial of "+a+" is "+res);
		


}
}