package Challenges.Overloading;

import java.util.Scanner;

public class VolumeSphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        double volume = (4.0 / 3.0) * Math.PI * r * r * r;
        System.out.println("Volume of sphere: " + volume);
        sc.close();
	}

}
