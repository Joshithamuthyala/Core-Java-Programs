package Challenges.MultiThreading;
class Mythread extends Thread {
    public Mythread(String name) {
        super(name);
    }

    public void run() {
        System.out.println(getName() + " started");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(getName() + " finished");
    }
}
public class MultipleJoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mythread t1 = new Mythread("T1");
        Mythread t2 = new Mythread("T2");
        Mythread t3 = new Mythread("T3");

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("All threads finished, main thread ends");
	}

}
