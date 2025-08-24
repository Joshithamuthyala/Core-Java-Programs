package Challenges.Abstraction;
abstract class VehicleDriveo {
    abstract void drive();
    abstract void stop();
}

class Trucko extends VehicleDriveo {
    void drive() {
        System.out.println("Truck is driving on highway");
    }
    void stop() {
        System.out.println("Truck stopped at signal");
    }
}

class Caro extends VehicleDriveo {
    void drive() {
        System.out.println("Car is driving in city");
    }
    void stop() {
        System.out.println("Car stopped in parking");
    }
}

public class VehiAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
