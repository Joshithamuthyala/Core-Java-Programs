package Challenges.MultiThreading;
import java.util.concurrent.CountDownLatch;

class Worker extends Thread {
    private CountDownLatch latch;

    public Worker(String name, CountDownLatch latch) {
        super(name);
        this.latch = latch;
    }

    public void run() {
        try {
            System.out.println(getName() + " started work");
            Thread.sleep(1000);
            System.out.println(getName() + " finished work");
        } catch (InterruptedException e) {
            System.out.println(getName() + " interrupted");
        } finally {
            latch.countDown();
        }
    }
}

public class Countdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
        CountDownLatch latch = new CountDownLatch(n);

        for (int i = 1; i <= n; i++) {
            new Worker("Worker-" + i, latch).start();
        }

        try {
            latch.await();
        } catch (InterruptedException e) {
            System.out.println("Main interrupted");
        }

        System.out.println("All workers finished. Main thread continues.");
	}

}
