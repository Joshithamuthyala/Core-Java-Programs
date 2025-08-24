package Challenges.Interface;
interface RunnableC {
    void run();
}

interface WalkableC {
    void walk();
}

class Cheetahh implements RunnableC, WalkableC {
    @Override
    public void run() {
        System.out.println("Cheetah runs very fast.");
    }

    @Override
    public void walk() {
        System.out.println("Cheetah walks gracefully.");
    }
}

class Tortoisee implements RunnableC, WalkableC {
    @Override
    public void run() {
        System.out.println("Tortoise runs very slowly.");
    }

    @Override
    public void walk() {
        System.out.println("Tortoise walks slowly but steadily.");
    }
}

public class RunWalkObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cheetahh cheetah = new Cheetahh();
        Tortoisee tortoise = new Tortoisee();

        cheetah.run();
        cheetah.walk();

        tortoise.run();
        tortoise.walk();
	}

}
