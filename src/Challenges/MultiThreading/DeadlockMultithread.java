package Challenges.MultiThreading;
class Resource1 {}
class Resource2 {}

class Task1 extends Thread {
    private Resource1 r1;
    private Resource2 r2;

    Task1(Resource1 r1, Resource2 r2) {
        this.r1 = r1;
        this.r2 = r2;
    }

    public void run() {
        synchronized (r1) {
            System.out.println("Task1 locked Resource1");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            synchronized (r2) {
                System.out.println("Task1 locked Resource2");
            }
        }
    }
}

class Task2 extends Thread {
    private Resource1 r1;
    private Resource2 r2;

    Task2(Resource1 r1, Resource2 r2) {
        this.r1 = r1;
        this.r2 = r2;
    }

    public void run() {
        synchronized (r2) {
            System.out.println("Task2 locked Resource2");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            synchronized (r1) {
                System.out.println("Task2 locked Resource1");
            }
        }
    }
}

public class DeadlockMultithread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource1 r1 = new Resource1();
        Resource2 r2 = new Resource2();

        Task1 t1 = new Task1(r1, r2);
        Task2 t2 = new Task2(r1, r2);

        t1.start();
        t2.start();
	}

}
