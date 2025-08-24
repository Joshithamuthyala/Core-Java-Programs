package Challenges.EceptionHandling;

public class InterruptExcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main thread started...");

        Thread t1 = new Thread(() -> {
            try {
                System.out.println("Thread is going to sleep for 3 seconds...");
                Thread.sleep(3000);  // may throw InterruptedException
                System.out.println("Thread woke up after sleep!");
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted while sleeping: " + e);
            }
        });

        t1.start();

        // Interrupt the thread after 1 second
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e);
        }

        t1.interrupt(); // Interrupting thread t1
        System.out.println("Main thread finished.");
	}

}
