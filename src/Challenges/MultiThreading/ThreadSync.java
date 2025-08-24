package Challenges.MultiThreading;
class Shared {
    void printTable(int n) {
        synchronized (this) {
            for (int i = 1; i <= 5; i++) {
                System.out.println(n * i);
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }
}
class MyThread1 extends Thread {
    Shared s;
    MyThread1(Shared s) {
        this.s = s;
    }
    public void run() {
        s.printTable(5);
    }
}

class MyThread2 extends Thread {
    Shared s;
    MyThread2(Shared s) {
        this.s = s;
    }
    public void run() {
        s.printTable(100);
    }
}
public class ThreadSync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Shared obj = new Shared();
	        MyThread1 t1 = new MyThread1(obj);
	        MyThread2 t2 = new MyThread2(obj);
	        t1.start();
	        t2.start();
	}

}
