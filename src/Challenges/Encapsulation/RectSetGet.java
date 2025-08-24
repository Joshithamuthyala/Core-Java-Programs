package Challenges.Encapsulation;

import java.util.Scanner;

class Rectangle {
    private double length;
    private double width;
    private double area;

    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        if (length >= 0) {
            this.length = length;
            calculateArea();
        } else {
            System.out.println("Invalid length");
        }
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        if (width >= 0) {
            this.width = width;
            calculateArea();
        } else {
            System.out.println("Invalid width");
        }
    }

    public double getArea() {
        return area;
    }
    private void calculateArea() {
        this.area = this.length * this.width;
    }
}

public class RectSetGet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        Rectangle rect = new Rectangle();

        System.out.print("Enter rectangle length: ");
        rect.setLength(sc.nextDouble());

        System.out.print("Enter rectangle width: ");
        rect.setWidth(sc.nextDouble());

        System.out.println("\nRectangle Details:");
        System.out.println("Length: " + rect.getLength());
        System.out.println("Width: " + rect.getWidth());
        System.out.println("Area: " + rect.getArea());
        sc.close();
	}

}
