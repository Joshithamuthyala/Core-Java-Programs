package Challenges.Abstraction;
abstract class VehicleDrive {
    abstract void drive();
    abstract void stop();
}

class Truck extends VehicleDrive {
    void drive() {
        System.out.println("Truck is driving on highway");
    }
    void stop() {
        System.out.println("Truck stopped at signal");
    }
}

class Car extends VehicleDrive {
    void drive() {
        System.out.println("Car is driving in city");
    }
    void stop() {
        System.out.println("Car stopped in parking");
    }
}

public class VehiInvoke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehicleDrive v1 = new Truck();
        v1.drive();
        v1.stop();

        VehicleDrive v2 = new Car();
        v2.drive();
        v2.stop();
	}

}
