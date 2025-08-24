package Challenges.Datatypes;

import java.util.Scanner;

public class StringToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number as String: ");
        String strNum = sc.nextLine();
        int num = Integer.parseInt(strNum);
        System.out.println("String to Integer: " + num);
        System.out.print("Enter a number as Integer: ");
        int intNum = sc.nextInt();
        String str = Integer.toString(intNum);
        System.out.println("Integer to String: " + str);
	        sc.close();
	}

}
