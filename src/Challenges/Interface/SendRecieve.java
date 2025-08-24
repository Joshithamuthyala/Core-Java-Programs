package Challenges.Interface;
interface Sendable {
    void send(String message);
}

interface Receivable {
    void receive(String message);
}

class Transmitter implements Sendable {
    @Override
    public void send(String message) {
        System.out.println("Transmitting message: " + message);
    }
}

class Receiver implements Receivable {
    @Override
    public void receive(String message) {
        System.out.println("Receiving message: " + message);
    }
}
public class SendRecieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
