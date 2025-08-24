package Challenges.String;

import java.util.Scanner;

public class VOWELANDCONSO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		String str= sc.nextLine();
		int vow_count=0,cons_count=0;
		str= str.toUpperCase();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='A'&&str.charAt(i)<='Z') {
				if( str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'
						||str.charAt(i)=='O'||str.charAt(i)=='U') {
					vow_count++;
					
				}
				else {
					cons_count++;
				}
			}
		}
		System.out.println("The vowel count is "+vow_count);
		System.out.println("The consonant count is "+cons_count);
		sc.close();
	}

}
