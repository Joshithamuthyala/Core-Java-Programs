package Challenges.Encapsulation;

import java.util.Scanner;

class Car {
    private String model;
    private String color;
    private double price;

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if(price >= 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price");
        }
    }
}

public class CarEncap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        Car car = new Car();

        System.out.print("Enter car model: ");
        car.setModel(sc.nextLine());

        System.out.print("Enter car color: ");
        car.setColor(sc.nextLine());

        System.out.print("Enter car price: ");
        car.setPrice(sc.nextDouble());

        System.out.println("\nCar Details (Using Encapsulation):");
        System.out.println("Model: " + car.getModel());
        System.out.println("Color: " + car.getColor());
        System.out.println("Price: " + car.getPrice());
        sc.close();
	}

}
