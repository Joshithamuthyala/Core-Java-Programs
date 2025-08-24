package Challenges.Encapsulation;

import java.util.Scanner;
class Circl {
    private double radius;
    private double area;
    private double circumference;

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        if (radius >= 0) {
            this.radius = radius;
            this.area = Math.PI * radius * radius;
            this.circumference = 2 * Math.PI * radius;
        } else {
            System.out.println("Invalid radius");
        }
    }

    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }

    public double getCircumference() {
        return circumference;
    }
    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }
}

public class CircleSetGet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        Circl circle = new Circl();

        System.out.print("Enter radius: ");
        circle.setRadius(sc.nextDouble());

        System.out.println("\nCircle Details:");
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference: " + circle.getCircumference());
        sc.close();
	}

}
