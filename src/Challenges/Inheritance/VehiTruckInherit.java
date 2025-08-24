package Challenges.Inheritance;
class Vehicle0 {
    String make;
    String model;
    int year;

    Vehicle0(String make, String model, int year) {
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

class Trucki extends Vehicle0 {
    double capacity;
    double mileage;

    Trucki(String make, String model, int year, double capacity, double mileage) {
        super(make, model, year);
        this.capacity = capacity;
        this.mileage = mileage;
    }

    void display() {
        super.display();
        System.out.println("Capacity: " + capacity + " tons");
        System.out.println("Mileage: " + mileage + " km/l");
    }
}
public class VehiTruckInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
