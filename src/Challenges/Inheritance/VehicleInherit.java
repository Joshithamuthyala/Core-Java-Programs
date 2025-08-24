package Challenges.Inheritance;
class Vehicleo {
    String make;
    String model;
    int year;

    Vehicleo(String make, String model, int year) {
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

class Cari extends Vehicleo {
    String color;
    double mileage;

    Cari(String make, String model, int year, String color, double mileage) {
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
public class VehicleInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
