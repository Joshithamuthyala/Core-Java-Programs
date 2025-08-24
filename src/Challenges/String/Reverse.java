package Challenges.String;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		String str= sc.nextLine();
		String res="";
		for(int i=str.length()-1;i>=0;i--) {
			res= res+str.charAt(i);
		}
		System.out.println("The reversed string is : "+res);
		sc.close();
	}

}
