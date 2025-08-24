package Challenges.MultiThreading;
class Worke extends Thread {
    public Worke(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " running " + i + " with priority " + getPriority());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted");
            }
        }
    }
}

public class Threadpriorities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worke t1 = new Worke("LowPriority");
        Worke t2 = new Worke("NormalPriority");
        Worke t3 = new Worke("HighPriority");

        t1.setPriority(Thread.MIN_PRIORITY);   // 1
        t2.setPriority(Thread.NORM_PRIORITY);  // 5
        t3.setPriority(Thread.MAX_PRIORITY);   // 10

        t1.start();
        t2.start();
        t3.start();
	}

}
