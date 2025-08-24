package Challenges.Collection;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
class DelayedElement implements Delayed {
    private String data;
    private long startTime;

    public DelayedElement(String data, long delayInSeconds) {
        this.data = data;
        this.startTime = System.currentTimeMillis() + delayInSeconds * 1000;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long diff = startTime - System.currentTimeMillis();
        return unit.convert(diff, TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        return Long.compare(this.getDelay(TimeUnit.MILLISECONDS), o.getDelay(TimeUnit.MILLISECONDS));
    }

    @Override
    public String toString() {
        return data;
    }
}

public class DelayQueuedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 DelayQueue<DelayedElement> queue = new DelayQueue<>();

	        System.out.println("Adding elements with delay...");
	        queue.put(new DelayedElement("Task1", 3));
	        queue.put(new DelayedElement("Task2", 5));
	        queue.put(new DelayedElement("Task3", 1));

	        System.out.println("Retrieving elements :");
	        for (int i = 0; i < 3; i++) {
	            try {
	                DelayedElement e = queue.take();
	                System.out.println("Retrieved: " + e);
	            } catch (InterruptedException ex) {
	                ex.printStackTrace();
	            }
	        }
	}

}
