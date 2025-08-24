package Challenges.Interface;
interface Sendablee {
    void send(String message);
}

interface Receivablee {
    void receive(String message);
}

class Transmitteru implements Sendablee {
    @Override
    public void send(String message) {
        System.out.println("Transmitting message: " + message);
    }
}

class Receiveru implements Receivablee {
    @Override
    public void receive(String message) {
        System.out.println("Receiving message: " + message);
    }
}
public class SendREcieveObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transmitteru transmitter = new Transmitteru();
        Receiveru receiver = new Receiveru();

        transmitter.send("Hello, this is a test signal!");
        receiver.receive("Hello, message received successfully!");
	}

}
