package Challenges.MultiThreading;

class Task extends Thread {
    private static ThreadLocal<Integer> local = ThreadLocal.withInitial(() -> 0);

    public Task(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            local.set(local.get() + 1);
            System.out.println(getName() + " value: " + local.get());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted");
            }
        }
    }
}

public class Localthreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task t1 = new Task("Thread-1");
        Task t2 = new Task("Thread-2");

        t1.start();
        t2.start();
	}

}
