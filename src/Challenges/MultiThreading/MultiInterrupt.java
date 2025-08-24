package Challenges.MultiThreading;
class WorkerThread extends Thread {
    public WorkerThread(String name) {
        super(name);
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(getName() + " running " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + " was interrupted");
        }
        System.out.println(getName() + " ends");
    }
}

public class MultiInterrupt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WorkerThread t1 = new WorkerThread("T1");
        WorkerThread t2 = new WorkerThread("T2");

        t1.start();
        t2.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        t1.interrupt();
        t2.interrupt();
	}

}
