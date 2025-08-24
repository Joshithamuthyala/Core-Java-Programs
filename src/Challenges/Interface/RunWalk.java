package Challenges.Interface;
interface RunnableCustom {
    void run();
}

interface WalkableCustom {
    void walk();
}

class Cheetah implements RunnableCustom, WalkableCustom {
    @Override
    public void run() {
        System.out.println("Cheetah runs very fast.");
    }

    @Override
    public void walk() {
        System.out.println("Cheetah walks gracefully.");
    }
}

class Tortoise implements RunnableCustom, WalkableCustom {
    @Override
    public void run() {
        System.out.println("Tortoise runs very slowly.");
    }

    @Override
    public void walk() {
        System.out.println("Tortoise walks slowly but steadily.");
    }
}

public class RunWalk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
