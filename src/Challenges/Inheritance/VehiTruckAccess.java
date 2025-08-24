package Challenges.Inheritance;
class Vehicle1 {
    String make;
    String model;
    int year;

    Vehicle1(String make, String model, int year) {
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

class Truck extends Vehicle1 {
    double capacity;
    double mileage;

    Truck(String make, String model, int year, double capacity, double mileage) {
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
public class VehiTruckAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle1 v = new Vehicle1("Tata", "SUV", 2020);
        System.out.println("Vehicle Details:");
        v.display();

        System.out.println();

        Truck t = new Truck("Ashok Leyland", "Cargo", 2022, 10, 5.5);
        System.out.println("Truck Details:");
        t.display();
	}

}
