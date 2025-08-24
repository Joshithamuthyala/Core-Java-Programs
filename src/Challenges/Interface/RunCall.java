package Challenges.Interface;
interface Runnable {
    void run();
}

interface Callable {
    void call();
}

class MyThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running...");
    }
}

class Task implements Callable {
    @Override
    public void call() {
        System.out.println("Task is being executed...");
    }
}

public class RunCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
