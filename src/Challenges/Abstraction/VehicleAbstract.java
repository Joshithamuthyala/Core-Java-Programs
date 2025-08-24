package Challenges.Abstraction;
abstract class Vehiclee {
    abstract void start();
    abstract void stop();
}

class Care extends Vehiclee {
    void start() {
        System.out.println("Car starts with a key");
    }
    void stop() {
        System.out.println("Car stops with brakes");
    }
}

class Motorcyclee extends Vehiclee {
    void start() {
        System.out.println("Motorcycle starts with a self-start button");
    }
    void stop() {
        System.out.println("Motorcycle stops with disc brakes");
    }
}

public class VehicleAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
