package Challenges.Static;

import java.util.Scanner;

class VolumeCalc {
    static double cylinderVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }
}
public class VolCylStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        System.out.println("Volume of cylinder is: " + VolumeCalc.cylinderVolume(r, h));
        sc.close();
	}

}
