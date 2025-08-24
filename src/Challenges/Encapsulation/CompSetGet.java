package Challenges.Encapsulation;

import java.util.Scanner;

class Computer {
    private String brand;
    private String model;
    private double price;

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price");
        }
    }
}
public class CompSetGet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        Computer computer = new Computer();

        System.out.print("Enter computer brand: ");
        computer.setBrand(sc.nextLine());

        System.out.print("Enter computer model: ");
        computer.setModel(sc.nextLine());

        System.out.print("Enter computer price: ");
        computer.setPrice(sc.nextDouble());

        System.out.println("\nComputer Details:");
        System.out.println("Brand: " + computer.getBrand());
        System.out.println("Model: " + computer.getModel());
        System.out.println("Price: " + computer.getPrice());
        sc.close();
	}

}
