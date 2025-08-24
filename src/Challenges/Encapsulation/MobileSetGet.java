package Challenges.Encapsulation;

import java.util.Scanner;

class Mobile {
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

public class MobileSetGet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        Mobile mobile = new Mobile();

        System.out.print("Enter mobile brand: ");
        mobile.setBrand(sc.nextLine());

        System.out.print("Enter mobile model: ");
        mobile.setModel(sc.nextLine());

        System.out.print("Enter mobile price: ");
        mobile.setPrice(sc.nextDouble());

        System.out.println("\nMobile Details:");
        System.out.println("Brand: " + mobile.getBrand());
        System.out.println("Model: " + mobile.getModel());
        System.out.println("Price: " + mobile.getPrice());
        sc.close();
	}

}
