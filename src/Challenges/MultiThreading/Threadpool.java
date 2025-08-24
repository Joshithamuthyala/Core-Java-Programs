package Challenges.MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyTask implements Runnable {
    private String name;

    MyTask(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("Task " + name + " is running on " + Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Task " + name + " finished on " + Thread.currentThread().getName());
    }
}

public class Threadpool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++) {
            executor.execute(new MyTask("Task-" + i));
        }

        executor.shutdown();
	}

}
