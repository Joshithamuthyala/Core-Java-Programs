package Challenges.Abstraction;
abstract class Vehicle {
    abstract void start();
    abstract void stop();
}

class Caru extends Vehicle {
    void start() {
        System.out.println("Car starts with a key");
    }
    void stop() {
        System.out.println("Car stops with brakes");
    }
}

class Motorcycle extends Vehicle {
    void start() {
        System.out.println("Motorcycle starts with a self-start button");
    }
    void stop() {
        System.out.println("Motorcycle stops with disc brakes");
    }
}

public class VehicleInvoke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Vehicle v1 = new Caru();
	        v1.start();
	        v1.stop();

	        Vehicle v2 = new Motorcycle();
	        v2.start();
	        v2.stop();
	}

}
