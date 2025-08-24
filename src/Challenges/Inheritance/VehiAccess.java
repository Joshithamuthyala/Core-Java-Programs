package Challenges.Inheritance;
class Vehicle {
    String make;
    String model;
    int year;

    Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    void display() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

class Car extends Vehicle {
    String color;
    double mileage;

    Car(String make, String model, int year, String color, double mileage) {
        super(make, model, year);
        this.color = color;
        this.mileage = mileage;
    }

    void display() {
        super.display();
        System.out.println("Color: " + color);
        System.out.println("Mileage: " + mileage);
    }
}
public class VehiAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v = new Vehicle("Honda", "Civic", 2020);
        System.out.println("Vehicle Details:");
        v.display();

        System.out.println();

        Car c = new Car("Toyota", "Corolla", 2022, "Red", 18.5);
        System.out.println("Car Details:");
        c.display();
	}

}
