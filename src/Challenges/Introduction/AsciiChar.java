package Challenges.Introduction;
import java.util.Scanner;
public class AsciiChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch = sc.next().charAt(0);

        int ascii = (int) ch;

        System.out.println("ASCII value of '" + ch + "' is: " + ascii);
	sc.close();
	}
	

}
