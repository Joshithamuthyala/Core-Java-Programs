package Challenges.Interface;
interface Runner {
    void run();
}

interface Caller {
    void call();
}

class MyThreadcustom implements Runner {
    @Override
    public void run() {
        System.out.println("Thread is running...");
    }
}

class Tasks implements Caller {
    @Override
    public void call() {
        System.out.println("Task is being executed...");
    }
}

public class RunCallObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MyThreadcustom thread = new MyThreadcustom();
	        Tasks task = new Tasks();

	        thread.run();
	        task.call();
	}

}
