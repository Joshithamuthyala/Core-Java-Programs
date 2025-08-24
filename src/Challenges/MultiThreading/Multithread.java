package Challenges.MultiThreading;
class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Thread started: " + getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println(getName() + " interrupted");
        }
        System.out.println("Thread finished: " + getName());
    }
}
public class Multithread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t1 = new MyThread("T1");
        MyThread t2 = new MyThread("T2");
        MyThread t3 = new MyThread("T3");

        t1.start();
        t2.start();
        t3.start();
	}

}
