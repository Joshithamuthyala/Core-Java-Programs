package Challenges.Introduction;
import java.util.Scanner;
public class DecimaltoBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a decimal number:");
	        int decimal = sc.nextInt();
	        String binary = "";
	        
	        while (decimal > 0) {
	            binary = (decimal % 2) + binary;
	            decimal = decimal / 2;
	        }

	        System.out.println("Binary representation: " + binary);
	    sc.close();
	}

}
