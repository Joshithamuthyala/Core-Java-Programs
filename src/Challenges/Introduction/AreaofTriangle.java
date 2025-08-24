package Challenges.Introduction;
import java.util.Scanner;
public class AreaofTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the breadth of the triangle:");
		double b = sc.nextDouble();
		System.out.println("Enter the height of the triangle:");
		double h= sc.nextDouble();
		 double area= (0.5*b*h);
		System.out.println("the area of the triangle is:"+area);
		sc.close();
	}

}
