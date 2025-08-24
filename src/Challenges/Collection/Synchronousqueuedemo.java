package Challenges.Collection;
import java.util.concurrent.SynchronousQueue;
import java.util.Scanner;

public class Synchronousqueuedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        SynchronousQueue<String> queue = new SynchronousQueue<>();

	        Thread producer = new Thread(() -> {
	            try {
	                System.out.print("Enter message to send: ");
	                String msg = sc.nextLine();
	                System.out.println("Producer putting: " + msg);
	                queue.put(msg);  
	                System.out.println("Producer finished.");
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        });

	        Thread consumer = new Thread(() -> {
	            try {
	                Thread.sleep(1000); 
	                String msg = queue.take(); 
	                System.out.println("Consumer received: " + msg);
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        });

	        producer.start();
	        consumer.start();

	        try {
	            producer.join();
	            consumer.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        sc.close();
	}

}
